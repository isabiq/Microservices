package com.example.democlient.config;

import org.springframework.context.annotation.Bean;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;

/**
 * @author y.nadir
 *
 */
public class RibbonConfiguration {
    @Bean
    public IPing ribbonPing(final IClientConfig config) {
        /*
         * The PingUrl implementation will check if services are alive.
         */
        return new PingUrl(false, "demo-service/api/formeJuridiques");
    }
    
    @Bean
    public IRule ribbonRule(final IClientConfig config) {
        /*
         * The AvailabilityFilteringRule is an alternative to the default
         * RoundRobinRule. It also cycles through the instances but, besides
         * that, it takes into account the availability being checked by our new
         * pings to skip some instances in case they don’t respond.
         */
        return new AvailabilityFilteringRule();
    }
}