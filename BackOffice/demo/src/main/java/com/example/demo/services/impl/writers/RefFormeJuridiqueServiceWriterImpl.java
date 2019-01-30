/**
 * 
 */
package com.example.demo.services.impl.writers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.RefFormeJuridique;
import com.example.demo.properties.FooProperties;
import com.example.demo.properties.Parameters;
import com.example.demo.repositories.RefFormeJuridiqueRepository;
import com.example.demo.services.writers.RefFormeJuridiqueServiceWriter;

/**
 * @author y.nadir
 *
 */
// TODO: exeternalize in One annotation
@Service
@Transactional
public class RefFormeJuridiqueServiceWriterImpl implements RefFormeJuridiqueServiceWriter {
    
    @Autowired
    RefFormeJuridiqueRepository refFormeJuridiqueRepository;
    
    @Autowired
    FooProperties fooProperties;
    
    @Autowired
    Parameters parameters;
    
    @Override
    public RefFormeJuridique add(RefFormeJuridique refFormeJuridique) {
        return refFormeJuridiqueRepository.save(refFormeJuridique);
    }
    
}
