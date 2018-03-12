/**
 * 
 */
package com.example.democlient.integration.clients;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.democlient.integration.dto.RefFormeJuridique;
import com.example.democlient.integration.interfaces.DemoService;

/**
 * @author y.nadir
 *
 */
@Component
public class DemoServiceRestClient implements DemoService {
    
    @Autowired
    RestTemplate restTemplate;
    
    @Override
    public List<RefFormeJuridique> findAll() {
        ResponseEntity<List<RefFormeJuridique>> exchange = this.restTemplate.exchange("http://demo-service/api/all", HttpMethod.GET, null,
                new ParameterizedTypeReference<List<RefFormeJuridique>>() {
                });
        
        return exchange.getBody();
        
    }
    
    @Override
    public RefFormeJuridique findById(Long id) {
        ResponseEntity<RefFormeJuridique> exchange = this.restTemplate.exchange("http://demo-service/api/formeJuridique/{id}",
                HttpMethod.GET, null, new ParameterizedTypeReference<RefFormeJuridique>() {
                }, id);
        
        return exchange.getBody();
    }
    
}
