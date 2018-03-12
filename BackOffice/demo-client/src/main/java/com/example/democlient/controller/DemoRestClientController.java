/**
 * 
 */
package com.example.democlient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.democlient.integration.clients.DemoServiceRestClient;
import com.example.democlient.integration.dto.RefFormeJuridique;

/**
 * @author y.nadir
 *
 */
@RestController
@RequestMapping(value = "/demoRestClient")
public class DemoRestClientController {
    
    @Autowired
    DemoServiceRestClient demoServiceRestClient;
    
    @RequestMapping(value = "/formeJuridique/all", method = RequestMethod.GET)
    public List<RefFormeJuridique> findAll() {
        return demoServiceRestClient.findAll();
    }
    
    @RequestMapping(value = "/formeJuridique/{id}", method = RequestMethod.GET)
    public RefFormeJuridique findById(@PathVariable Long id) {
        return demoServiceRestClient.findById(id);
    }
    
}
