package com.example.demo.properties;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.function.Consumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class YamlPropertiesTest {
	
	@Autowired
	FooProperties fooProperties;

	@Test
	public void verifyListPropertyValues() {
		Consumer<MyPojo> consumerMyPojo = new Consumer<MyPojo>() {
		    public void accept(MyPojo myPojo) {
		    	assertThat(myPojo.getName()).isEqualTo("my another name");
		    	assertThat(myPojo.getDescription()).isNull();
		    }
		};
		
		fooProperties.getList().forEach(
				consumerMyPojo
		);

	}

}
