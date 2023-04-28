package com.exception;

public class PaySlipNotFoundException extends RuntimeException{

	public PaySlipNotFoundException() {
		
	}
	
	public PaySlipNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	
	public String toString() {
		return "something went wrong";
	}
}
