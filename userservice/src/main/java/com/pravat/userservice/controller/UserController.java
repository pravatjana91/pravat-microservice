package com.pravat.userservice.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "v1/userservice")
public class UserController {

	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public String getLicenses(@PathVariable("name") String name) {

		return "hello world user service " + name;
	}

}