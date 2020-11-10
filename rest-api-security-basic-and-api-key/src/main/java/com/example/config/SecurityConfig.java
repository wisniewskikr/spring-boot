package com.example.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

import com.example.security.filters.APIKeyAuthFilter;

@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecurityConfig {
	
	@Configuration
	@Order(1)
	public class BasicConfig extends WebSecurityConfigurerAdapter {
		
		@Value(value = "${api.username}")
	    private String apiUsername;
	    @Value(value = "${api.password}")
	    private String apiPassword;
		

	    @Override
	    protected void configure(HttpSecurity http) throws Exception {
	   	
	    	http.authorizeRequests()
	    		.antMatchers("/greeting-basic").hasRole("USER")
	    		.anyRequest().authenticated()
	        .and()
	        	.httpBasic()
	        .and()
	        	.csrf().disable();

	    }

	    @Override
	    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	    	
	        auth.inMemoryAuthentication()
	                .withUser(apiUsername).password("{noop}"+apiPassword).roles("USER");
	        
	    }	    
	    
	}	
	
	@Configuration
	@Order(2)
	public class ApiKeyConfig extends WebSecurityConfigurerAdapter {
		
		@Value("${api.key.name}")
	    private String apiKeyName;

	    @Value("${api.key.value}")
	    private String apiKeyValue;

	    @Override
	    protected void configure(HttpSecurity httpSecurity) throws Exception {
	        APIKeyAuthFilter filter = new APIKeyAuthFilter(apiKeyName);
	        filter.setAuthenticationManager(new AuthenticationManager() {

	            @Override
	            public Authentication authenticate(Authentication authentication) throws AuthenticationException {
	                String principal = (String) authentication.getPrincipal();
	                if (!apiKeyValue.equals(principal))
	                {
	                    throw new BadCredentialsException("The API key was not found or not the expected value.");
	                }
	                authentication.setAuthenticated(true);
	                return authentication;
	            }
	        });
	        httpSecurity.
	            antMatcher("/greeting-api-key").
	            csrf().disable().
	            sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).
	            and().addFilter(filter).authorizeRequests().anyRequest().authenticated();	      

	    }
		
	}
    

}
