package com.ty.spring_boot_user_app_with_swagger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ty.spring_boot_user_app_with_swagger.dto.ResponseStructure;
import com.ty.spring_boot_user_app_with_swagger.dto.UserInfo;
import com.ty.spring_boot_user_app_with_swagger.service.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
public class UserController {

	@Autowired
	private UserService service;
	
	@Operation(description = "To Save User Info", summary = "user will be saved in the database")
	@ApiResponses(value=@ApiResponse(description = "User Created", responseCode = "201"))
	@PostMapping("/user")
	public ResponseEntity<ResponseStructure<UserInfo>> saveUser(@RequestBody UserInfo userInfo){
		
		return  service.save(userInfo);
	}
	
	@ApiResponses(value = @ApiResponse(description = "User Accepected", responseCode = "202"))
	@Operation(description = "to update User Info", summary = "user will updated in the database")
	@PutMapping("/user")
	public ResponseEntity<ResponseStructure<UserInfo>> updateUser(@RequestBody UserInfo userInfo){
		
		return  service.update(userInfo);
	}
}
