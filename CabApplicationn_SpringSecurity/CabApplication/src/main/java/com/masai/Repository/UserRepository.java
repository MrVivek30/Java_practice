package com.masai.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.masai.Entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	public Optional<User> findByEmail(String email);
	@Query("select u from User u where sqrt(((?1 - u.x_coordinate) * (?1 - u.x_coordinate)) + ((?2 -  u.y_coordinate) * (?2 -  u.y_coordinate))) <= 5")
	public List<User> findByDistance(Integer x, Integer y);
}
