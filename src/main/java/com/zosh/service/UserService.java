package com.zosh.service;

import com.zosh.exception.UserException;
import com.zosh.model.User;

public interface UserService {
	
	public User findUserById(Long userid)throws UserException;
	
	public User findUserProfileByJwt(String jwt)throws UserException;
	
	
}
