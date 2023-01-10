package com.multijson.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.multijson.demo.dto.Address;
import com.multijson.demo.dto.User;

@RestController
public class UserController {
	
	@PostMapping("/saveUser")
	public User saveUserInfo(@RequestBody User user) {
		Address address = user.getAddress();
		System.out.println(address);
		System.out.println(user.getAddress());
		System.out.println(user);
		return user;
	}

}
