/**
 * 
 */
package com.example.democlient.integration.fallbacks;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.democlient.integration.dto.RefFormeJuridique;
import com.example.democlient.integration.interfaces.DemoServiceFeign;

/**
 * @author y.nadir
 *
 */
@Component
public class DemoServiceFeignClientFallback implements DemoServiceFeign {
    
    @Override
    public List<RefFormeJuridique> findAll() {
        // TODO Auto-generated method stub
        return Collections.emptyList();
    }
    
    @Override
    public RefFormeJuridique findById(Long id) {
        System.out.println("FallBack called");
        return new RefFormeJuridique();
    }
    
}
