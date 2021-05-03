package com.example.app.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.responses.GreetingResponse;

@RestController
public class GreetingController {

	@GetMapping(value="/greeting", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<GreetingResponse> greetingGet() {
		
		GreetingResponse response = new GreetingResponse(HttpStatus.OK, "GET: Hello World!");
		return new ResponseEntity<>(response, HttpStatus.OK);
		
	}
	
	@PostMapping(value="/greeting", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<GreetingResponse> greetingPost() {
		
		GreetingResponse response = new GreetingResponse(HttpStatus.OK, "POST: Hello World!");
		return new ResponseEntity<>(response, HttpStatus.OK);
		
	}
	
}