package com.example.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.example.we.clients.GreetingWsClient;
import com.example.we.elements.ObjectFactory;

@Configuration
public class WebServiceConfig {
	
	private static final String SERVER_URI = "http://localhost:8080/app/ws";

	@Bean
    public Jaxb2Marshaller marshaller() {
        
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setPackagesToScan(ObjectFactory.class.getPackage().getName());
        return marshaller;
        
    }
	
	@Bean
	public  GreetingWsClient greetingWsClient(Jaxb2Marshaller marshaller) {
		
		GreetingWsClient client = new GreetingWsClient();
		client.setDefaultUri(SERVER_URI);
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
		
	}

}
