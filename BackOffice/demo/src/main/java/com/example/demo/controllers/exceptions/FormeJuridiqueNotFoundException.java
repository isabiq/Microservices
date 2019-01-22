/**
 * 
 */
package com.example.demo.controllers.exceptions;

/**
 * @author y.nadir
 *
 */
public class FormeJuridiqueNotFoundException extends NotFoundException {
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    public FormeJuridiqueNotFoundException(Long code, Long idFormeJuridique) {
        super(code, "Could not find FormeJuridique " + idFormeJuridique);
    }
}
