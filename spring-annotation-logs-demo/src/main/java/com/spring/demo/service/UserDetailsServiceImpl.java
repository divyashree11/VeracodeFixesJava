package com.spring.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.demo.model.User;
import com.spring.demo.repository.UserDetailsRepository;
import com.spring.demo.util.CustomLogger;

@Service("UserDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {
	
	public static final CustomLogger LOGGER = new CustomLogger();
	
	@Autowired
	UserDetailsRepository userRepo;
	
	public UserDetailsServiceImpl(){	
	}

	public UserDetailsServiceImpl(UserDetailsRepository userRepo){
		this.userRepo = userRepo;
	}
	
	public void setUserRepo(UserDetailsRepository userDetailsRepo) {
		this.userRepo = userDetailsRepo;
	}

	public String createUser(User user) {
		LOGGER.debug("<<<<In create User Service>>>>");
		return userRepo.createUSer(user);
	}
}
