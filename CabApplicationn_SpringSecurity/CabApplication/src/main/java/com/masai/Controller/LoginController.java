package com.masai.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Repository.UserRepository;
@RestController
public class LoginController {
	
	@Autowired
	private UserRepository userRep;
	
	@GetMapping("/masaicab/user/login")
	public ResponseEntity<com.masai.Entities.User> getLoggedInEmployeeDetailsHandler(Authentication auth){
		
		com.masai.Entities.User user= userRep.findByEmail(auth.getName()).orElseThrow(() -> new BadCredentialsException("Invalid Username or password"));
		 
		 return new ResponseEntity<>(user, HttpStatus.ACCEPTED);
	}
}
