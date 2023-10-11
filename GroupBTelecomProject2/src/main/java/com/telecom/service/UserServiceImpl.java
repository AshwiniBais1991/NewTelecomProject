package com.telecom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telecom.model.User;
import com.telecom.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	/*
	 * this method is use to store user detail if we pass user information Or also
	 * use to store user as well as Recharge if we pass both class data in postman
	 * according to feilds
	 */


	@Override
	public User saveUser(User user) {
		User user1 = userRepository.save(user);
		return user1;
	}

}
