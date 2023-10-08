package com.telecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telecom.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
