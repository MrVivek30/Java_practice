package com.masai.service;

import java.util.List;
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
public class TutorilaServiceImpl implements TutorialService {
	
	@Autowired
	private CommentRepository comntRepo;
	
	@Autowired
	private TutorialRepository tutoRepo;

	@Override
	public Tutorial createTutorial(Tutorial tutorial) throws TutorialException {
		// TODO Auto-generated method stub
		if(tutorial==null) {
			throw new TutorialException("Something Went Wrong!!");
		}
		
		
		return tutoRepo.save(tutorial);
	}

	@Override
	public List<Comments> getAllComments(Integer id) throws TutorialException, CommentsException {
		Optional<Tutorial> tutj=tutoRepo.findById(id);
		
		if(tutj.isPresent()) {
			List<Comments> comments=tutj.get().getComments();
			if(comments.size()==0) {
				throw new CommentsException("No comments");
			}
			return comments;
		}else {
			throw new TutorialException("No Tutorial With this id"+id);
		}
		
	}

	@Override
	public Tutorial deleteTutorial(Integer id) throws TutorialException {
		Optional<Tutorial> tutj=tutoRepo.findById(id);
		if(tutj.isPresent()) {
			Tutorial tutorial1=tutj.get();
			tutoRepo.delete(tutorial1);
			return tutorial1;
			
			
		}else {
			throw new TutorialException("No Tutorial With this id"+id);
		}
		
	}

	@Override
	public Tutorial deleteAllTutorialComments(Integer id) throws TutorialException {
		Optional<Tutorial> tutj=tutoRepo.findById(id);
		if(tutj.isPresent()) {
			Tutorial tutorial1=tutj.get();
			tutorial1.setComments(null);
			tutoRepo.delete(tutorial1);
			return tutorial1;
			
			
		}else {
			throw new TutorialException("No Tutorial With this id"+id);
		}
	}
	
	

}
