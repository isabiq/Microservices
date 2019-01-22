/**
 * 
 */
package com.example.demo.controllers.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.demo.controllers.exceptions.NotFoundException;
import com.example.demo.controllers.exceptions.wrapper.ExceptionMessageWrapper;

/**
 * @author y.nadir
 *
 */
@ControllerAdvice
public class NotFoundAdvice {
    
    @ResponseBody
    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    ExceptionMessageWrapper notFoundHandler(NotFoundException ex) {
        return new ExceptionMessageWrapper(ex.getCode(), ex.getMessage());
    }
}
