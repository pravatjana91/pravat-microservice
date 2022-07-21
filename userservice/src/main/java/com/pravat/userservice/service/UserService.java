package com.pravat.userservice.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pravat.userservice.repository.DepartmentRepository;
import com.pravat.userservice.repository.EmployeeRepository;

@Service
@Slf4j
public class UserService {

	@Autowired
    private RestTemplate restTemplate;

	@Autowired
    private EmployeeRepository employeeRepository;

	@Autowired
    private DepartmentRepository departmentRepository;

	public String getDepartmentService(String name) {
		
	  //  String department =restTemplate.getForObject("http://localhost:9002/department/" + name,String.class);
	    String department =restTemplate.getForObject("http://DEPARTMENT-SERVICE/department/" + name,String.class);
		
		return department;
	}
 }

