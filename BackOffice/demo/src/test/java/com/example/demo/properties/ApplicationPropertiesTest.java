package com.example.demo.properties;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationPropertiesTest {
	
	@Autowired
	Parameters parameters;

	@Test
	public void verifyParameterForDevProperties() {

		assertThat(parameters.getEnv()).isEqualTo("testDev");

	}
	
	@Test
	public void verifyParameterFromApplicationProperties() {

		assertThat(parameters.getParentProperty()).isEqualTo("parent");

	}

}