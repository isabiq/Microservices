package com.example.democlient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.example.democlient.integration.dto.RefFormeJuridique;
import com.example.democlient.integration.fallbacks.DemoServiceFeignClientFallback;

@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
@EnableDiscoveryClient

public class DemoClientApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(DemoClientApplication.class, args);
    }
    
    @Component
    class DiscoveryClientExample implements CommandLineRunner {
        
        @Autowired
        private DiscoveryClient discoveryClient;
        
        @Override
        public void run(String... strings) throws Exception {
            discoveryClient.getInstances("demo-service").forEach((ServiceInstance s) -> {
                System.out.println("Info about demo-service");
                System.out.println("Host: " + s.getHost());
                System.out.println("Port: " + s.getPort());
                System.out.println("Service Id: " + s.getServiceId());
                s.getMetadata().forEach((k, v) -> System.out.println(k + ":" + v));
            });
        }
    }
    
    @Component
    class RestTemplateExample implements CommandLineRunner {
        
        @Autowired
        // See Config.java
        private RestTemplate restTemplate;
        
        @Override
        public void run(String... strings) throws Exception {
            // use the "smart" Eureka-aware RestTemplate
            ResponseEntity<List<RefFormeJuridique>> exchange = this.restTemplate.exchange("http://demo-service/api/all", HttpMethod.GET,
                    null, new ParameterizedTypeReference<List<RefFormeJuridique>>() {
                    });
            
            exchange.getBody().forEach((refForme) -> System.out.println(refForme.getLibelle()));
        }
        
    }
    
    @Component
    class FeignExample implements CommandLineRunner {
        
        @Autowired
        private DemoClient demoClient;
        
        @Override
        public void run(String... strings) throws Exception {
            System.out.println("I am reached feign");
            this.demoClient.findAll().forEach((refForme) -> System.out.println(refForme.getId() + " " + refForme.getLibelle()));
            System.out.println(this.demoClient.findById(1l));
        }
    }
    
    @FeignClient(name = "demo-service", fallback = DemoServiceFeignClientFallback.class)
    interface DemoClient {
        
        @RequestMapping(value = "/api/all", method = RequestMethod.GET)
        List<RefFormeJuridique> findAll();
        
        @RequestMapping(value = "/api/formeJuridique/{id}", method = RequestMethod.GET)
        public RefFormeJuridique findById(@PathVariable("id") Long id);
    }
}
