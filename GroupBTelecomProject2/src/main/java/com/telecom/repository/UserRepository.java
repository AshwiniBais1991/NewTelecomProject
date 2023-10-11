package com.telecom.repository;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.telecom.model.User;

public interface UserRepository extends CrudRepository<User, Serializable> {
	
}
