package com.pravat.userservice.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pravat.userservice.repository.EmployeeRepository;

@Service
@Slf4j
public class UserService {

	@Autowired
    private EmployeeRepository employeeRepository;

 }

