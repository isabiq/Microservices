/**
 * 
 */
package com.example.democlient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.democlient.integration.satus.ServiceInfo;
import com.example.democlient.integration.satus.ServiceStatus;

/**
 * @author y.nadir
 *
 */
@RestController
@RequestMapping("/demoService")
public class DemoServiceStatusController {
    
    @Autowired
    private ServiceStatus serviceStatus;
    
    @RequestMapping(value = "/status", method = RequestMethod.GET)
    public List<ServiceInfo> getInfo() {
        return serviceStatus.getInfo("demo-service");
    }
}
