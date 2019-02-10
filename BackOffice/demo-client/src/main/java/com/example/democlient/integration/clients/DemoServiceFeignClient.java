/**
 * 
 */
package com.example.democlient.integration.clients;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.democlient.integration.dto.RefFormeJuridique;
import com.example.democlient.integration.interfaces.DemoServiceFeign;

/**
 * @author y.nadir
 *
 */
@Component
public class DemoServiceFeignClient implements DemoServiceFeign {
    
    @Autowired
    private DemoServiceFeign demoServiceFeign;
    
    @Override
    public List<RefFormeJuridique> findAll() {
        return demoServiceFeign.findAll();
    }
    
    @Override
    public RefFormeJuridique findById(Long id) {
        return demoServiceFeign.findById(id);
    }
    
}
