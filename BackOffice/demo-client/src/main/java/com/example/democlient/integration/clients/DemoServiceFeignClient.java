/**
 * 
 */
package com.example.democlient.integration.clients;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.democlient.integration.dto.RefFormeJuridique;
import com.example.democlient.integration.interfaces.DemoService;
import com.example.democlient.integration.interfaces.DemoServiceFeign;

/**
 * @author y.nadir
 *
 */
@Component
public class DemoServiceFeignClient implements DemoServiceFeign {
    
    @Autowired
    private DemoService demoService;
    
    @Override
    public List<RefFormeJuridique> findAll() {
        return demoService.findAll();
    }
    
    @Override
    public RefFormeJuridique findById(Long id) {
        return demoService.findById(id);
    }
    
}
