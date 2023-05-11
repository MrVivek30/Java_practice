package com.masai.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Entities.Cab;
import com.masai.Entities.User;
import com.masai.Service.CabService;
import com.masai.Service.UserService;

import jakarta.validation.Valid;
@RestController
@RequestMapping("/masaicab/driver")
public class DriverController {
	@Autowired
	private UserService userSer;
	@Autowired
	private CabService cabSer;
	
	@PostMapping("/register") 
	public ResponseEntity<User> registerDriver(@Valid @RequestBody User driver, @Valid @RequestBody Cab cab) {
		User d = userSer.registerUser(driver);
		cab.setDriver(d);
		Cab c = cabSer.registerCab(cab);
		return new ResponseEntity<>(d, HttpStatus.CREATED);
	}
}
