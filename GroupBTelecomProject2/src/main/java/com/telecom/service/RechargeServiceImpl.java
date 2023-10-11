package com.telecom.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telecom.model.Recharge;
import com.telecom.repository.RechargeRepository;

@Service
public class RechargeServiceImpl implements RechargeService {

	@Autowired
	private RechargeRepository rechargeRepository;

	/*
	 * this method is use to save Recharge if we pass only Rcharge detail Or use to
	 * strore rcharge and user if we pass accordingly in postman
	 */
	@Override
	public Recharge saveRecharge(Recharge recharge) {
		Recharge recharge1 = rechargeRepository.save(recharge);
		return recharge1;
	}


	
	


}
