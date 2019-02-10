package com.quebic.auth.api.security.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.quebic.auth.api.model.User;
import com.quebic.auth.api.security.JwtUser;

@Service
public class JwtUserDetailsServiceImpl implements UserDetailsService {
    
    private Logger logger = LoggerFactory.getLogger(JwtUserDetailsServiceImpl.class);
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        logger.debug("Loading user - {}", username);
        
        if (!"abc".equals(username)) {
            throw new UsernameNotFoundException(username);
        }
        
        UserDetails userDetails;
        
        User user;
        
        try {
            
            if (logger.isDebugEnabled())
                logger.debug("userService-{}");
            
            // username may be email
            user = new User();
            user.setUsername("abc");
            user.setPassword("abcabcabc");
            user.setFirstName("abc fname");
            user.setLastName("abc lName");
            user.setEmail("unes82@gmail.com");
            user.setId("1");
            user.setAttempts(1);
            user.setLastLoggedOn(new Date());
            user.setLastPasswordResetDate(new Date());
            
            if (logger.isDebugEnabled())
                logger.debug("user - {}", user);
            
            userDetails = new JwtUser(user, getAuthorities(user), true);
            
            if (userDetails.getAuthorities().isEmpty()) {
                logger.debug("User - {}, Permission count - 0", username);
                throw new UsernameNotFoundException(username);
            }
            
            return userDetails;
            
        } catch (Exception e) {
            if (logger.isErrorEnabled())
                logger.error("Service call error", e);
            throw new UsernameNotFoundException(username);
        }
        
    }
    
    public Collection<GrantedAuthority> getAuthorities(User user) {
        
        List<GrantedAuthority> authList = new ArrayList<>();
        
        authList.add(new SimpleGrantedAuthority("ROLE_" + "USER"));
        
        return authList;
        
    }
    
}
