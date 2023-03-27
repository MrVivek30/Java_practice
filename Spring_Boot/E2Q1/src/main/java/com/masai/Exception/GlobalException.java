package com.masai.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class GlobalException extends RuntimeException {
	@ExceptionHandler(StudentException.class)
	public ResponseEntity<String> myIllegalHandler(StudentException ie)  {
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
