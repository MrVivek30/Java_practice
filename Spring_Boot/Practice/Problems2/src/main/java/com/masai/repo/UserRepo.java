package com.masai.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.masai.models.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	@Query("select u from User u where u.id=?1")
public User findByIds(Integer id);


}