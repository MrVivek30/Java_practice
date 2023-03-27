package com.masai.service;

import java.util.List;

import com.masai.models.Email;
import com.masai.models.User;

public interface UserService {
public List<User> getUsers();
public User addUser(User user);
public User getUserById(Integer id);
public User deleteUser(Integer id);
public Email getEmailforUser(Integer id);
public Email createEmailForUser(Integer id,Email email);

}
