package com.masai.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(TutorialException.class)
	public ResponseEntity<String> myIllegalHandler(TutorialException ie)  {
		System.out.println("inside myHandler method...");
		
	 return new ResponseEntity<String>(ie.getMessage(),HttpStatus.BAD_REQUEST);
		

	}
	
	//to handle any other type of Exception
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> myExceptionHandler(Exception e) {
		System.out.println("inside myHandler method...");
		
		 return new ResponseEntity<String>(e.getMessage(),HttpStatus.BAD_REQUEST);
		
	}
	
}
