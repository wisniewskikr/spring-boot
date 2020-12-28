package com.example.ws.endpoints;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.example.ws.elements.GreetingRequest;
import com.example.ws.elements.GreetingResponse;


@Endpoint
public class GreetingWsEndpoint {

	@ResponsePayload
	@PayloadRoot(localPart="greetingRequest", namespace="http://example.com/ws/elements")
	public GreetingResponse greetingRequest( @RequestPayload GreetingRequest request) {
		
		GreetingResponse response = new GreetingResponse();
		response.setMessage("Hello World " + request.getName());
		return response;
	}

}
