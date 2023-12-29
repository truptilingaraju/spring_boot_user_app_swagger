package com.ty.spring_boot_user_app_with_swagger.userRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.spring_boot_user_app_with_swagger.dto.UserInfo;

public interface UserRepository extends JpaRepository<UserInfo , Integer> {

}
