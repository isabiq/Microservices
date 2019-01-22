/**
 * 
 */
package com.example.demo.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author y.nadir
 *
 */
@Entity
@Table(name = "prs_ref_forme_juridique")
public class RefFormeJuridique implements Serializable {
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue
    @Column(name = "ID")
    @NotNull
    private Long id;
    
    @Column(nullable = false)
    @Size(max = 100)
    private String libelle;
    
    protected RefFormeJuridique() {
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
