package com.masai.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Entities.User;
import com.masai.Exception.UserException;
import com.masai.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRep;

	@Override
	public User registerUser(User user) {
		return userRep.save(user);
	}

	@Override
	public User updateUser(int userID, User user) throws UserException {
		Optional<User> opt = userRep.findById(userID);
		if(opt == null) throw new UserException("Invalid User ID.");
		User u = opt.get();
		u = user;
		return userRep.save(u);
	}

	@Override
	public List<User> getAllUsers() {
		List<User> users = userRep.findAll();
		return users;
	}

	@Override
	public List<User> getAllDrivers(int x, int y) throws UserException {
		List<User> drivers = userRep.findByDistance(x, y);
		if(drivers.size() == 0) throw new UserException("No driver found within 5kms");
		return drivers;
	}

}
