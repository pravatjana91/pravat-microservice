package com.pravat.userservice.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(value = "v1/userservice")
public class UserController {


	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String get() {

		return "hello world departmet service ";
	}
	
	@RequestMapping(value = "/department/{name}", method = RequestMethod.GET)
	public String getLicenses(@PathVariable("name") String name) {

		return "hello world department service " + name;
	}

}
