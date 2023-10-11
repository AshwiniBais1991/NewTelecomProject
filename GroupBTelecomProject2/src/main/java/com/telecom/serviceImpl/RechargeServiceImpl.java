package com.telecom.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telecom.model.Recharge;
import com.telecom.repository.RechargeRepository;
import com.telecom.service.RechargeService;

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


	/*
	 * this method is use for delete recharge by id, if recharge is associated with
	 * user then both user and recharge will get deleted Or if recharge is not
	 * associated with user then only recharge get deleted
	 */
	@Override
	public void deleteRecharge(int rechargeId) {
		rechargeRepository.deleteById(rechargeId);

	
	
	}
	
@Override
	public Recharge findByRechargeId(int rechargeId) {
		Recharge recharge = rechargeRepository.findByRechargeId(rechargeId);
		return recharge;
	}
}
