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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.CommentsException;
import com.masai.exception.TutorialException;
import com.masai.model.Comments;
import com.masai.model.Tutorial;
import com.masai.service.TutorialService;

@RestController
@RequestMapping("/api")
public class TutorialController {
	
	@Autowired
	private TutorialService tutorialService;
	
	@PostMapping("/tutorials")
	public ResponseEntity<Tutorial> saveTutorila(@RequestBody Tutorial tutorial) throws TutorialException {

		Tutorial u = tutorialService.createTutorial(tutorial);
		return new ResponseEntity<>(u, HttpStatus.CREATED);

	}
	
	
	@GetMapping("/tutorials/{id}")
	public ResponseEntity<List<Comments>> getComments(@PathVariable Integer id) throws TutorialException,CommentsException{
		List<Comments> u = tutorialService.getAllComments(id);
		return new ResponseEntity<>(u, HttpStatus.OK);
	}
	
	@DeleteMapping("/tutorials/{id}")
	public ResponseEntity<Tutorial> deleteTutorila(@PathVariable Integer id) throws CommentsException, TutorialException {

		Tutorial com=tutorialService.deleteTutorial(id);
		return new ResponseEntity<>(com, HttpStatus.CREATED);

	}
	
	@DeleteMapping("/tutorials/{id}/comments")
	public ResponseEntity<Tutorial> deleteAllTutorila(@PathVariable Integer id) throws CommentsException, TutorialException {

		Tutorial com=tutorialService.deleteAllTutorialComments(id);
		return new ResponseEntity<>(com, HttpStatus.CREATED);

	}


}
