/**
 * 
 */
package com.example.demo.controllers.exceptions;

/**
 * @author y.nadir
 *
 */
public class FormeJuridiqueNotFoundException extends RuntimeException {
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    public FormeJuridiqueNotFoundException(Long id) {
        super("Could not find FormeJuridique " + id);
    }
}
