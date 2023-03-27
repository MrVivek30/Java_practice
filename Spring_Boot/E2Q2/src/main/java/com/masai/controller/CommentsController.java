package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.CommentsException;
import com.masai.exception.TutorialException;
import com.masai.model.Comments;
import com.masai.service.CommentsService;

@RestController
@RequestMapping("/api")
public class CommentsController {
	
	@Autowired
	private CommentsService commentsService;
	
	
	@PostMapping("/tutorials/{id}")
	public ResponseEntity<Comments> saveComments(@PathVariable Integer id,@RequestBody Comments comments) throws TutorialException, CommentsException {

		Comments com=commentsService.postComments(id, comments);
		return new ResponseEntity<>(com, HttpStatus.CREATED);

	}
	
	@GetMapping("/comments/{id}")
	public ResponseEntity<Comments> getComment(@PathVariable Integer id) throws CommentsException {

		Comments com=commentsService.getComment(id);
		return new ResponseEntity<>(com, HttpStatus.CREATED);

	}
	
	@PutMapping("/comments/{id}")
	public ResponseEntity<Comments> postComments(@PathVariable Integer id,@RequestBody Comments comments) throws CommentsException {

		Comments com=commentsService.updateComment(id, comments);
		return new ResponseEntity<>(com, HttpStatus.CREATED);

	}
	
	@DeleteMapping("/comments/{id}")
	public ResponseEntity<Comments> deleteComment(@PathVariable Integer id) throws CommentsException {

		Comments com=commentsService.getComment(id);
		return new ResponseEntity<>(com, HttpStatus.CREATED);

	}

}
