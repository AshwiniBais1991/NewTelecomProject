package com.telecom.repository;

//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.telecom.model.Recharge;

public interface RechargeRepository extends JpaRepository<Recharge, Integer> {



}
