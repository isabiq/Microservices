/**
 * 
 */
package com.example.democlient.integration.dto;

import java.io.Serializable;

/**
 * @author y.nadir
 *
 */

public class RefFormeJuridique implements Serializable {
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private Long id;
    
    private String libelle;
    
    public RefFormeJuridique() {
        super();
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getLibelle() {
        return libelle;
    }
    
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    
}
