package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.models.Email;
import com.masai.models.User;
import com.masai.service.UserService;

@RestController
public class EmailController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/getusers")
	public ResponseEntity<List<User>> getAllUser(){
		List<User> users=userService.getUsers();
		return new ResponseEntity<List<User>>(users,HttpStatus.OK);
	}
	
	@PostMapping("/adduser")
	public ResponseEntity<User> addUser(@RequestBody User user){
		User user2=userService.addUser(user);
		return new ResponseEntity<User>(user2,HttpStatus.OK);
	}
	
	@GetMapping("/userbyid/{id}")
	public ResponseEntity<User> getUserId(@PathVariable Integer id){
		User user=userService.getUserById(id);
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteuser/{id}")
	public ResponseEntity<User> deleteUsers(@PathVariable Integer id){
		User user=userService.deleteUser(id);
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	
	@PostMapping("/user/{id}/mail")
	public ResponseEntity<Email> addEmail(@PathVariable Integer id,Email email){
		Email email2=userService.createEmailForUser(id, email);
		return new ResponseEntity<Email>(email2,HttpStatus.OK);
	}
	
}
