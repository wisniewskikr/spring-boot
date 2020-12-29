package com.example.configs;

import org.apache.wss4j.dom.WSConstants;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.soap.security.wss4j2.Wss4jSecurityInterceptor;

import com.example.we.clients.GreetingWsClient;
import com.example.we.elements.ObjectFactory;

@Configuration
public class WsConfig {
	
	@Value(value = "${soap.server.uri}")
	private String serverUri;
	
	@Value(value = "${soap.username}")
    private String soapUsername;
	
    @Value(value = "${soap.password}")
    private String soapPassword;
	
	@Bean
    public Jaxb2Marshaller marshaller() {
        
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setPackagesToScan(ObjectFactory.class.getPackage().getName());
        return marshaller;
        
    }
	
	@Bean
	public  GreetingWsClient greetingWsClient(Jaxb2Marshaller marshaller) {
		
		GreetingWsClient client = new GreetingWsClient();
		client.setDefaultUri(serverUri);
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        // Authentication
        client.getWebServiceTemplate().setInterceptors(new ClientInterceptor[]{ securityInterceptor() });
        return client;
		
	}
	  
	@Bean
    public Wss4jSecurityInterceptor securityInterceptor(){
        Wss4jSecurityInterceptor wss4jSecurityInterceptor = new Wss4jSecurityInterceptor();
        wss4jSecurityInterceptor.setSecurementActions("Timestamp UsernameToken");
        wss4jSecurityInterceptor.setSecurementUsername(soapUsername);
        wss4jSecurityInterceptor.setSecurementPassword(soapPassword);
        wss4jSecurityInterceptor.setSecurementPasswordType(WSConstants.PW_TEXT);
        return wss4jSecurityInterceptor;
    }

}
