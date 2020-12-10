package com.example.we.clients;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.example.we.elements.GreetingRequest;
import com.example.we.elements.GreetingResponse;

public class GreetingWsClient extends WebServiceGatewaySupport {
	
	public GreetingResponse getGreetingResponse(String name) {
		
		GreetingRequest request = new GreetingRequest();
		request.setName(name);
		
		GreetingResponse response = (GreetingResponse) getWebServiceTemplate().marshalSendAndReceive(request);
		return response;
		
	}

}
