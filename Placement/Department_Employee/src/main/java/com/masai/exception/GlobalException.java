package com.masai.exception;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalException {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<myerror>myerroeHandler(WebRequest w,Exception e){
		
		myerror myerror=new myerror();
		
		myerror.setDesc(w.getDescription(false));
		myerror.setMsg(e.getMessage());
		myerror.setTimestamp(LocalDate.now());
		
		return  new ResponseEntity<>(myerror,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(EmplyeeException.class)
	public ResponseEntity<myerror>EmployeeExceptionHandler(WebRequest w,EmplyeeException e){
		
		myerror myerror=new myerror();
		
		myerror.setDesc(w.getDescription(false));
		myerror.setMsg(e.getMessage());
		myerror.setTimestamp(LocalDate.now());
		
		return  new ResponseEntity<>(myerror,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(DepartmentException.class)
	public ResponseEntity<myerror>DepartmentExceptionHandler(WebRequest w,DepartmentException e){
		
		myerror myerror=new myerror();
		
		myerror.setDesc(w.getDescription(false));
		myerror.setMsg(e.getMessage());
		myerror.setTimestamp(LocalDate.now());
		
		return  new ResponseEntity<>(myerror,HttpStatus.BAD_REQUEST);
	}
}
