package com.telecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telecom.model.Recharge;
import com.telecom.model.User;
import com.telecom.service.RechargeService;
import com.telecom.service.UserService;

@RestController
public class UserAndRechargeRestController {

	@Autowired
	private UserService userService;
	@Autowired
	private RechargeService rechargeService;

	/*
	 * User to store User alone or User and REcharge together
	 */
	@PostMapping("/saveUserAndRecharge")
	public User saveUserAndRecharge(@RequestBody User user) {
		User user1 = userService.saveUser(user);
		return user1;
	}

	
	/*
	 * this method is use to save Recharge if we pass only Rcharge detail Or use to
	 * strore rcharge and user if we pass accordingly in postman
	 */
	@PostMapping("/saveRecharge")
	public Recharge saveRecharge(@RequestBody Recharge recharge) {
		Recharge recharge1 = rechargeService.saveRecharge(recharge);
		return recharge1;
	}
	
	
}
