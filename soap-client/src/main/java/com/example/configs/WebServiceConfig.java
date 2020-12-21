package com.example.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.example.we.clients.GreetingWsClient;
import com.example.we.elements.GreetingError;
import com.example.we.elements.GreetingRequest;
import com.example.we.elements.GreetingResponse;

@Configuration
public class WebServiceConfig {
	
	@Bean
    public Jaxb2Marshaller marshaller() {
        
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.example.ws.elements");
//		marshaller.setPackagesToScan("com.example.ws.elements");
//		marshaller.setClassesToBeBound(GreetingError.class, GreetingRequest.class, GreetingResponse.class);
        return marshaller;
        
    }
	
	@Bean
	public  GreetingWsClient greetingWsClient(Jaxb2Marshaller marshaller) {
		
		GreetingWsClient client = new GreetingWsClient();
		client.setDefaultUri("http://localhost:8080/ws");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
		
	}

}
