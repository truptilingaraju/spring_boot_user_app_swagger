package com.ty.spring_boot_user_app_with_swagger.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.spring_boot_user_app_with_swagger.dto.UserInfo;
import com.ty.spring_boot_user_app_with_swagger.userRepository.UserRepository;

@Repository
public class UserDao {

	@Autowired
	private UserRepository repository;
	
	public UserInfo save(UserInfo userInfo) {
		return repository.save(userInfo);
	}
	
	public UserInfo update(UserInfo userInfo) {
		return repository.save(userInfo);
	}
}
