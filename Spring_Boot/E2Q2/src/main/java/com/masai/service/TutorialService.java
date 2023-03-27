package com.masai.service;

import java.util.List;

import com.masai.exception.CommentsException;
import com.masai.exception.TutorialException;
import com.masai.model.Comments;
import com.masai.model.Tutorial;

public interface TutorialService {
	
	public Tutorial createTutorial(Tutorial tutorial) throws TutorialException;
	public List<Comments> getAllComments(Integer id) throws TutorialException,CommentsException;
	public Tutorial deleteTutorial(Integer id) throws TutorialException;
	public Tutorial deleteAllTutorialComments(Integer id) throws TutorialException;

}
