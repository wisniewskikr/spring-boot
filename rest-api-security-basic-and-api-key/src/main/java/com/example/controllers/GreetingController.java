package com.example.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.responses.GreetingResponse;

@RestController
public class GreetingController {

	@GetMapping(value="/greeting-basic", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<GreetingResponse> greetingBasic() {
		
		GreetingResponse response = new GreetingResponse(HttpStatus.OK, "Hello World! (Basic)");
		return new ResponseEntity<>(response, HttpStatus.OK);
		
	}
	
	@GetMapping(value="/greeting-api-key", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<GreetingResponse> greetingApiKey() {
		
		GreetingResponse response = new GreetingResponse(HttpStatus.OK, "Hello World! (API Key)");
		return new ResponseEntity<>(response, HttpStatus.OK);
		
	}
	
}