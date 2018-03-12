/**
 * 
 */
package com.example.demo.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

/**
 * @author y.nadir
 *
 */

@Component
@Getter
@Setter
public class Parameters {
    
    @Value("${spring.datasource.driver-class-name}")
    private String dataSource;
    
    @Value("${spring.profiles}")
    private String env;
    
    @Value("${app.java.version}")
    private String javaVersion;
    
}
