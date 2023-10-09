package com.telecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telecom.model.Recharge;

public interface RechargeRepository extends JpaRepository<Recharge, Integer> {

}