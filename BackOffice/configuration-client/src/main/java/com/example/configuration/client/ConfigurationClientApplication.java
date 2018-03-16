package com.example.configuration.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author y.nadir
 *
 */
@SpringBootApplication
public class ConfigurationClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationClientApplication.class, args);
	}
	@RestController
	@RefreshScope
	class MessageRestController{
		@Value("${msg:Hello world - Config Server is not working..pelase check}")
		private String message;
		
		@RequestMapping("/message")
		String getMessage(){
			return this.message;
		}
	} 
	
}
