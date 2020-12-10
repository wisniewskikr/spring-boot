package com.example.application;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.example.we.clients.GreetingWsClient;
import com.example.we.elements.GreetingError;
import com.example.we.elements.GreetingRequest;
import com.example.we.elements.GreetingResponse;
import com.example.we.elements.ObjectFactory;

public class Application {

    public static void main(String[] args) throws JAXBException {
    	
//    	JAXBContext jaxbContext = JAXBContext.newInstance(com.example.we.elements.GreetingRequest.class);
    	
    	Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
//      marshaller.setContextPath("com.example.ws.elements");
//		marshaller.setPackagesToScan("com.example.ws.elements");
		marshaller.setClassesToBeBound(GreetingError.class, GreetingRequest.class, GreetingResponse.class, ObjectFactory.class);
		
		GreetingWsClient client = new GreetingWsClient();
		client.setDefaultUri("http://localhost:8081/ws");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        
        GreetingResponse response = client.getGreetingResponse("Chris");
        System.out.println(response.getMessage());
    	
    }

}
