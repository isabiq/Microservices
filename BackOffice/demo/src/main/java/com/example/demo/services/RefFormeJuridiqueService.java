/**
 * 
 */
package com.example.demo.services;

import java.util.List;

import com.example.demo.models.RefFormeJuridique;

/**
 * @author y.nadir
 *
 */
public interface RefFormeJuridiqueService {
    
    List<RefFormeJuridique> findAll();
    
    RefFormeJuridique findById(Long id);
    
}
