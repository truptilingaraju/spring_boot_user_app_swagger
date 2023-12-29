package com.ty.spring_boot_user_app_with_swagger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ty.spring_boot_user_app_with_swagger.dao.UserDao;
import com.ty.spring_boot_user_app_with_swagger.dto.ResponseStructure;
import com.ty.spring_boot_user_app_with_swagger.dto.UserInfo;

@Service
public class UserService {

	@Autowired
	private UserDao dao;
	

	public ResponseEntity<ResponseStructure<UserInfo>> save(UserInfo userInfo){
		UserInfo info=dao.save(userInfo);
		
		ResponseStructure<UserInfo> structure= new ResponseStructure<>();
		structure.setStatuCode(HttpStatus.CREATED.value());
		structure.setMessage("data saved successfully");
		structure.setData(info);
		
		return new ResponseEntity<ResponseStructure<UserInfo>>(structure,HttpStatus.CREATED);
	}
	
	public ResponseEntity<ResponseStructure<UserInfo>> update(UserInfo userInfo){
		UserInfo info=dao.save(userInfo);
		
		ResponseStructure<UserInfo> structure= new ResponseStructure<>();
		structure.setStatuCode(HttpStatus.ACCEPTED.value());
		structure.setMessage("data updated successfully");
		structure.setData(info);
		
		return new ResponseEntity<ResponseStructure<UserInfo>>(structure,HttpStatus.ACCEPTED);
	}
}
