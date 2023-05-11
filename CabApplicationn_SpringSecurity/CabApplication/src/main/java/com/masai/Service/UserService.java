package com.masai.Service;

import java.util.List;

import com.masai.Entities.User;
import com.masai.Exception.UserException;

public interface UserService {
	public User registerUser(User user);
	public User updateUser(int userID, User user) throws UserException;
	public List<User> getAllUsers();
	public List<User> getAllDrivers(int x, int y) throws UserException;
}
