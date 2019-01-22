/**
 * 
 */
package com.example.demo.services.readers;

import java.util.List;
import java.util.Optional;

import com.example.demo.models.RefFormeJuridique;

/**
 * @author y.nadir
 *
 */
public interface RefFormeJuridiqueServiceReader {
    
    List<RefFormeJuridique> findAll();
    
    Optional<RefFormeJuridique> findById(Long id);
    
}
