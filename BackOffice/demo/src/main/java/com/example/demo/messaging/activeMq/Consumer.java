/**
 * 
 */
package com.example.demo.messaging.activeMq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author y.nadir
 *
 */
@Component
public class Consumer {
    
    @JmsListener(destination = "sample.queue")
    public void receiveQueue(String text) {
        System.out.println(text);
    }
    
}
