/**
 * 
 */
package com.example.democlient.integration.interfaces;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.democlient.integration.dto.RefFormeJuridique;

/**
 * @author y.nadir
 *
 */

public interface DemoService {
    @RequestMapping(value = "/api/formeJuridique/all", method = RequestMethod.GET)
    List<RefFormeJuridique> findAll();
    
    @RequestMapping(value = "/api/formeJuridique/{id}", method = RequestMethod.GET)
    public RefFormeJuridique findById(@PathVariable("id") Long id);
}
