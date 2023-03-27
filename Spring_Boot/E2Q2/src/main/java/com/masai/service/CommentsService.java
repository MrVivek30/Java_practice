package com.masai.service;

import com.masai.exception.CommentsException;
import com.masai.exception.TutorialException;
import com.masai.model.Comments;

public interface CommentsService {
	
	public Comments postComments(Integer id,Comments comments)throws TutorialException, CommentsException;
	public Comments getComment(Integer id)throws CommentsException;
	public Comments updateComment(Integer id,Comments comments)throws CommentsException;
	public Comments deleteComment(Integer id)throws CommentsException;



}
