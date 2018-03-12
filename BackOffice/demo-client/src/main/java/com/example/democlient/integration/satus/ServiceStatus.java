/**
 * 
 */
package com.example.democlient.integration.satus;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;

/**
 * @author y.nadir
 *
 */
@Component
public class ServiceStatus {
    
    @Autowired
    private DiscoveryClient discoveryClient;
    
    public List<ServiceInfo> getInfo(String springServiceName) {
        List<ServiceInfo> serviceInfoList = new ArrayList<ServiceInfo>();
        discoveryClient.getInstances("demo-service").forEach((ServiceInstance s) -> {
            serviceInfoList.add(ServiceInfo.builder().withHost(s.getHost()).withIsSecure(s.isSecure()).withMetadata(s.getMetadata())
                    .withPort(s.getPort()).withServiceId(s.getServiceId()).build());
        });
        return serviceInfoList;
    }
    
}
