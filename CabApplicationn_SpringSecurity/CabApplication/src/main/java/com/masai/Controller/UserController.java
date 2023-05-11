package com.masai.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Entities.Booking;
import com.masai.Entities.Role;
import com.masai.Entities.User;
import com.masai.Exception.UserException;
import com.masai.Service.BookingService;
import com.masai.Service.UserService;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/masaicab")
public class UserController {
	
	@Autowired
	private UserService userSer;
	
	@Autowired
	private BookingService bookSer;
	
	@Autowired
	private PasswordEncoder pc;
	
	@PostMapping("/user/register")
	public ResponseEntity<User> registerUser(@Valid @RequestBody User user) {
		//user.setRole(Role.valueOf(user.getRole()));
		user.setPassword(pc.encode(user.getPassword()));
		return new ResponseEntity<>(userSer.registerUser(user), HttpStatus.CREATED);
	}
	@SecurityRequirement(name = "bearer-key")
	@PreAuthorize("hasRole('ROLE_ADMIN', 'ROLE_USER')")
	@PutMapping("/user/{userID}")
	public ResponseEntity<User> updateUser(@Valid @RequestBody User user, @PathVariable("userID") Integer userID) throws UserException {
		return new ResponseEntity<>(userSer.updateUser(userID, user), HttpStatus.OK);
	}
	@SecurityRequirement(name = "bearer-key")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	@GetMapping("/users") 
	public ResponseEntity<List<User>> getAll() {
		return new ResponseEntity<>(userSer.getAllUsers(), HttpStatus.OK);
	}
	@SecurityRequirement(name = "bearer-key")
	@PreAuthorize("hasRole('ROLE_USER')")
	@GetMapping("/user/findride")
	public ResponseEntity<List<User>> getAllDrivers(@RequestParam Integer x, @RequestParam Integer y) throws UserException {
		return new ResponseEntity<>(userSer.getAllDrivers(x, y), HttpStatus.OK);
	}
	@SecurityRequirement(name = "bearer-key")
	@PreAuthorize("hasRole('ROLE_USER')")
	@PutMapping("/user/book/{driverId}/{x}/{y}")
	public ResponseEntity<Booking> bookACab(@PathVariable("driverId") Integer driverId, @PathVariable("x") Integer x, @PathVariable("y") Integer y, @RequestParam Integer userID) throws UserException {
		return new ResponseEntity<>(bookSer.createBooking(userID, driverId, x, y), HttpStatus.OK);
	}
	
}
