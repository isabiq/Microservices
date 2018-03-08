/**
 * 
 */
package com.example.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.RefFormeJuridique;
import com.example.demo.properties.FooProperties;
import com.example.demo.properties.Parameters;
import com.example.demo.repositories.RefFormeJuridiqueRepository;
import com.example.demo.services.RefFormeJuridiqueService;

/**
 * @author y.nadir
 *
 */
@Service
public class RefFormeJuridiqueServiceImpl implements RefFormeJuridiqueService {
    
    @Autowired
    RefFormeJuridiqueRepository refFormeJuridiqueRepository;
    
    @Autowired
    FooProperties fooProperties;
    
    @Autowired
    Parameters parameters;
    
    @Override
    public List<RefFormeJuridique> findAll() {
        return refFormeJuridiqueRepository.findAll();
    }
    
    @Override
    public RefFormeJuridique findById(Long id) {
        
        return refFormeJuridiqueRepository.findById(id);
    }
    
}
