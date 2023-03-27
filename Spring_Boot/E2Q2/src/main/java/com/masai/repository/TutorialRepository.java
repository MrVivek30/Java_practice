package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.Tutorial;
@Repository
public interface TutorialRepository extends JpaRepository<Tutorial, Integer> {
	public List<Tutorial> findthemByTutorial(Tutorial tutorial);
}
