package com.pravat.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pravat.userservice.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String get() {

		return "hello world user service ";
	}
	
	@RequestMapping(value = "/userservice/{name}", method = RequestMethod.GET)
	public String getLicenses(@PathVariable("name") String name) {
		
		return "hello world user service " + name+"  dept"+userService.getDepartmentService(name);
	}

}
