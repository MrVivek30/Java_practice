package com.masai.Exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrDetails> allExceptionHandler(Exception ms, WebRequest req) {
		return new ResponseEntity<>(new ErrDetails(LocalDateTime.now(), ms.getMessage(), req.getDescription(false)), HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrDetails> inputValidationHandler(MethodArgumentNotValidException ms, WebRequest req) {
		return new ResponseEntity<>(new ErrDetails(LocalDateTime.now(), "Validation Error", ms.getBindingResult().getFieldError().getDefaultMessage()), HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(UserException.class)
	public ResponseEntity<ErrDetails> userExceptionHandler(UserException ms, WebRequest req) {
		return new ResponseEntity<>(new ErrDetails(LocalDateTime.now(), ms.getMessage(), req.getDescription(false)), HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<ErrDetails> noHandlerExceptionHandler(NoHandlerFoundException ms, WebRequest req) {
		return new ResponseEntity<>(new ErrDetails(LocalDateTime.now(), ms.getMessage(), req.getDescription(false)), HttpStatus.BAD_REQUEST);
	}
}
