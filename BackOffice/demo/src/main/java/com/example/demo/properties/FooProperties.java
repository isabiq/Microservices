/**
 * 
 */
package com.example.demo.properties;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;

/**
 * @author y.nadir
 *
 */
@Component
@ConfigurationProperties("foo")
public class FooProperties {

	@Getter
	private final List<MyPojo> list = new ArrayList<>();


}
