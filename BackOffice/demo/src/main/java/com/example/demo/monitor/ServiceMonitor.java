/**
 * 
 */
package com.example.demo.monitor;

/**
 * @author y.nadir
 *
 */
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceMonitor {
    
    @AfterReturning("execution(* com..*Service.*(..))")
    public void logServiceAccess(JoinPoint joinPoint) {
        // TODO: log
        System.out.println("Completed: " + joinPoint);
    }
    
}
