package com.exception;

public class BookException extends Exception {

	@Override
	public String toString() {
		return "Someything went wrong";
	}

	public BookException() {
		super();
	
	}

	
	
}
