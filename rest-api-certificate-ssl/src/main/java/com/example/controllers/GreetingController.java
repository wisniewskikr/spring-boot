package com.example.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.responses.GreetingResponse;

@RestController
public class GreetingController {

	@GetMapping(value="/", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<GreetingResponse> display() {
		
		GreetingResponse response = new GreetingResponse(HttpStatus.OK, "Hello World!");
		return new ResponseEntity<>(response, HttpStatus.OK);
		
	}
	
}