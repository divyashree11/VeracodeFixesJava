package com.spring.demo.repository;

import org.springframework.stereotype.Repository;

import com.spring.demo.model.User;
import com.spring.demo.util.CustomLogger;

@Repository("UserDetailsRepository")
public class UserDetailsRepositoryImpl implements UserDetailsRepository {

	public static final CustomLogger LOGGER = new CustomLogger();
	
	public String createUSer(User user) {
		LOGGER.debug("<<<In User create Repo Impl class>>>");
		return ("user created "+user.getName()+" with role "+user.getRole());
	}

}
