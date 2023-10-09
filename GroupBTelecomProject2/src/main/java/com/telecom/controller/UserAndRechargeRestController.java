package com.telecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telecom.model.User;
import com.telecom.service.UserService;

@RestController
public class UserAndRechargeRestController {
	
	@Autowired
	private UserService userService;

	@PostMapping("/saveUserAndRecharge")
	public User saveUserAndRecharge(@RequestBody User user) {
		User user1 = userService.saveUser(user);
		return user1;
	}

}
