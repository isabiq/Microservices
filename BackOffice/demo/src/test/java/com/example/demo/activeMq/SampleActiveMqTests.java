package com.example.demo.activeMq;

import static org.assertj.core.api.Assertions.assertThat;

import javax.jms.JMSException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.rule.OutputCapture;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.messaging.activeMq.Producer;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleActiveMqTests {
    
    @Autowired
    Producer producer;
    
    @Rule
    public OutputCapture outputCapture = new OutputCapture();
    
    @Test
    public void verifySimpleMessageFlow() throws InterruptedException, JMSException {
        producer.send("Simple hello message");
        Thread.sleep(1000L);
        assertThat(this.outputCapture.toString().contains("Simple hello message")).isTrue();
        
    }
    
}
