package com.masai.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(FlatException.class)
	public ResponseEntity<String> studentException(FlatException studentException){
		return new ResponseEntity<String>(studentException.getMessage(),HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> Exception(Exception exception){
		return new ResponseEntity<String>(exception.getMessage(),HttpStatus.BAD_REQUEST);
		
	}

	

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<String> validationException(MethodArgumentNotValidException exception){
		return new ResponseEntity<String>(exception.getMessage(),HttpStatus.BAD_REQUEST);
		
	}


	//to handle Not found exception 
			@ExceptionHandler(NoHandlerFoundException.class)
		public ResponseEntity<MyErrorDetails> mynotFoundHandler(MethodArgumentNotValidException me, NoHandlerFoundException nfe,WebRequest req)  {
				
		
		//MyErrorDetails err=new MyErrorDetails(LocalDateTime.now(), nfe.getMessage(), req.getDescription(false));
				MyErrorDetails err=new MyErrorDetails(LocalDateTime.now(), nfe.getMessage(), req.getDescription(false));
				err.setTimestamp(LocalDateTime.now());
				err.setMessage("validation error");
		        err.setDetails(me.getBindingResult().getFieldError().getDefaultMessage());
			return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
						
		}
			
}

