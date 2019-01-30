/**
 * 
 */
package com.example.demo.services.impl.readers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.RefFormeJuridique;
import com.example.demo.properties.FooProperties;
import com.example.demo.properties.Parameters;
import com.example.demo.repositories.RefFormeJuridiqueRepository;
import com.example.demo.services.readers.RefFormeJuridiqueServiceReader;

/**
 * @author y.nadir
 *
 */
@Service
@Transactional(readOnly = true)
public class RefFormeJuridiqueServiceReaderImpl implements RefFormeJuridiqueServiceReader {
    
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
    public Optional<RefFormeJuridique> findById(Long id) {
        
        RefFormeJuridique refFormeJuridique = refFormeJuridiqueRepository.findOne(id);
        
        return Optional.ofNullable(refFormeJuridique);
        
    }
}
