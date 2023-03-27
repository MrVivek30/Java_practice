package com.masai.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.CommentsException;
import com.masai.exception.TutorialException;
import com.masai.model.Comments;
import com.masai.model.Tutorial;
import com.masai.repository.CommentRepository;
import com.masai.repository.TutorialRepository;

@Service
public class CommentsServiceImpl implements CommentsService {
	
	@Autowired
	private CommentRepository comntRepo;
	
	@Autowired
	private TutorialRepository tutoRepo;

	@Override
	public Comments postComments(Integer id, Comments comments) throws TutorialException, CommentsException {
		// TODO Auto-generated method stub
		if(tutoRepo.findById(id).isPresent()){
			Tutorial tute=tutoRepo.findById(id).get();
			tute.getComments().add(comments);
			comments.setTutorial(tute);
			comntRepo.save(comments);
			
		}else {
			throw new TutorialException("No Tutotial with this Id"+id);
		}
		return comments;
	}

	@Override
	public Comments getComment(Integer id) throws CommentsException {
		// TODO Auto-generated method stub
		Optional<Comments> comentj=comntRepo.findById(id);
		if(comentj.isPresent()) {
			return comentj.get();
		}else {
			throw new CommentsException("roor with this " +id);
		}
		
	}

	@Override
	public Comments updateComment(Integer id, Comments comments) throws CommentsException {
		Optional<Comments> comentj=comntRepo.findById(id);
		if(comentj.isPresent()) {
			
			Comments cv=comentj.get();
			cv.setContent(comments.getContent());
			return comntRepo.save(cv);
		}else {
			throw new CommentsException("this id not be updated" +id);
		}
	}

	@Override
	public Comments deleteComment(Integer id) throws CommentsException {
		Optional<Comments> comentj=comntRepo.findById(id);
		if(comentj.isPresent()) {
			Comments com=comentj.get();
			comntRepo.deleteById(id);
			
			return comentj.get();
		}else {
			throw new CommentsException("Not able to "+id +" With given" );
		}
	}

}
