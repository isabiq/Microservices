/**
 * 
 */
package com.example.democlient.integration.satus;

import java.net.URI;
import java.util.Map;

import org.springframework.cloud.client.ServiceInstance;

/**
 * @author y.nadir
 *
 */
public class ServiceInfo implements ServiceInstance {
    
    private String serviceId;
    private String host;
    private int port;
    boolean isSecure;
    private URI uri;
    private Map<String, String> metadata;
    
    private ServiceInfo(Builder builder) {
        this.serviceId = builder.serviceId;
        this.host = builder.host;
        this.port = builder.port;
        this.isSecure = builder.isSecure;
        this.uri = builder.uri;
        this.metadata = builder.metadata;
    }
    
    public String getServiceId() {
        return serviceId;
    }
    
    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }
    
    public String getHost() {
        return host;
    }
    
    public void setHost(String host) {
        this.host = host;
    }
    
    public int getPort() {
        return port;
    }
    
    public void setPort(int port) {
        this.port = port;
    }
    
    public boolean isSecure() {
        return isSecure;
    }
    
    public void setSecure(boolean isSecure) {
        this.isSecure = isSecure;
    }
    
    public URI getUri() {
        return uri;
    }
    
    public void setUri(URI uri) {
        this.uri = uri;
    }
    
    public Map<String, String> getMetadata() {
        return metadata;
    }
    
    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }
    
    /**
     * Creates builder to build {@link ServiceInfo}.
     * 
     * @return created builder
     */
    
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Builder to build {@link ServiceInfo}.
     */
    
    public static final class Builder {
        private String serviceId;
        private String host;
        private int port;
        private boolean isSecure;
        private URI uri;
        private Map<String, String> metadata;
        
        private Builder() {
        }
        
        public Builder withServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        
        public Builder withHost(String host) {
            this.host = host;
            return this;
        }
        
        public Builder withPort(int port) {
            this.port = port;
            return this;
        }
        
        public Builder withIsSecure(boolean isSecure) {
            this.isSecure = isSecure;
            return this;
        }
        
        public Builder withUri(URI uri) {
            this.uri = uri;
            return this;
        }
        
        public Builder withMetadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }
        
        public ServiceInfo build() {
            return new ServiceInfo(this);
        }
    }
    
}
