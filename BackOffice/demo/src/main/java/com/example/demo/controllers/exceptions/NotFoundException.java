/**
 * 
 */
package com.example.demo.controllers.exceptions;

/**
 * @author y.nadir
 *
 */
public class NotFoundException extends RuntimeException {
    
    private Long code;
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    public NotFoundException(Long code, String message) {
        super(message);
        this.code = code;
    }
    
    public Long getCode() {
        return code;
    }
    
    public void setCode(Long code) {
        this.code = code;
    }
    
}
