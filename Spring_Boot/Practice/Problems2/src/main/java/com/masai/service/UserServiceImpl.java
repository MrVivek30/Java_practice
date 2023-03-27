package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.models.Email;
import com.masai.models.User;
import com.masai.repo.EmailRepo;
import com.masai.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepo userRepo;

	@Autowired
	private EmailRepo emailRepo;

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		List<User> users = userRepo.findAll();
		return users;
	}

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		User user2 = userRepo.save(user);
		return user2;
	}

	@Override
	public User getUserById(Integer id) {
		// TODO Auto-generated method stub
		Optional<User> user = userRepo.findById(id);
		if (user.isPresent()) {
			User exiUser = user.get();
			return exiUser;
		}
		return null;
	}

	@Override
	public User deleteUser(Integer id) {
		Optional<User> user = userRepo.findById(id);
		if (user.isPresent()) {
			User exiUser = user.get();
			userRepo.delete(exiUser);
			return exiUser;
		}
		return null;
	}

	@Override
	public Email getEmailforUser(Integer id) {
		// TODO Auto-generated method stub
		User user = userRepo.findByIds(id);
		if (user == null)
			return null;

		Optional<Email> emailOptional = Optional.ofNullable(user.getEmail());
		if (emailOptional.isPresent()) {
			Email email = emailOptional.get();
			return email;
		}

		return null;
	}

	@Override
	public Email createEmailForUser(Integer id, Email email) {
		// TODO Auto-generated method stub
		User user = userRepo.findByIds(id);
		if (user == null)
			return null;

		email.setUser(user);
		Email savEmail = emailRepo.save(email);

		return savEmail;
	}

}