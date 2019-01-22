/**
 * 
 */
package com.example.demo.controllers.exceptions.wrapper;

/**
 * @author y.nadir
 *
 */
public class ExceptionMessageWrapper {
    private Long code;
    private String libelle;
    
    public ExceptionMessageWrapper(Long code, String libelle) {
        this.code = code;
        this.libelle = libelle;
    }
    
    public Long getCode() {
        return code;
    }
    
    public String getLibelle() {
        return libelle;
    }
    
    public void setCode(Long code) {
        this.code = code;
    }
    
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    
}
