package com.example.democlient.integration.interfaces;

import org.springframework.cloud.openfeign.FeignClient;

import com.example.democlient.integration.fallbacks.DemoServiceFeignClientFallback;

/**
 * @author y.nadir
 *
 */
@FeignClient(value = "demo-service", fallback = DemoServiceFeignClientFallback.class)
public interface DemoServiceFeign extends DemoService {
    
}
