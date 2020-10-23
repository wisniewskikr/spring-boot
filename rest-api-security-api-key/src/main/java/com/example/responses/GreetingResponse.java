package com.example.responses;

import org.springframework.http.HttpStatus;

public class GreetingResponse extends AbstractResponse {
	
	
	private String text;
	
	
	public GreetingResponse(HttpStatus httpStatus, String text) {
		super(httpStatus, httpStatus.getReasonPhrase());
		this.text = text;
	}
	
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}

	
}
