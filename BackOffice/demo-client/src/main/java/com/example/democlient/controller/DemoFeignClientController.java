/**
 * 
 */
package com.example.democlient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.democlient.integration.clients.DemoServiceFeignClient;
import com.example.democlient.integration.dto.RefFormeJuridique;

/**
 * @author y.nadir
 *
 */
@RestController
@RequestMapping("/demoFeignClient")
public class DemoFeignClientController {
    
    @Autowired
    DemoServiceFeignClient demoServiceFeignClient;
    
    @GetMapping("/formeJuridiques")
    public List<RefFormeJuridique> findAll() {
        return demoServiceFeignClient.findAll();
    }
    
    @RequestMapping(value = "/formeJuridiques/{id}", method = RequestMethod.GET)
    public RefFormeJuridique findById(@PathVariable Long id) {
        return demoServiceFeignClient.findById(id);
    }
    
}
