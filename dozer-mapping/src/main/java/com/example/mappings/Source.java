package com.example.mappings;

public class Source {
	
	
	private String messageDefault;
	private String messageCustom;
		
	
	public Source(String messageDefault, String messageCustom) {
		this.messageDefault = messageDefault;
		this.messageCustom = messageCustom;
	}
	
	
	public String getMessageDefault() {
		return messageDefault;
	}
	public void setMessageDefault(String messageDefault) {
		this.messageDefault = messageDefault;
	}
	
	public String getMessageCustom() {
		return messageCustom;
	}
	public void setMessageCustom(String messageCustom) {
		this.messageCustom = messageCustom;
	}	
	

}
