package com.zosh.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zosh.model.User;


public interface UserRepository extends JpaRepository<User,Long> {
	
	public User findByEmail(String email);
}
