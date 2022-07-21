package com.pravat.userservice.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pravat.userservice.repository.DepartmentRepository;
import com.pravat.userservice.repository.EmployeeRepository;

@Service
@Slf4j
public class DepartmentService {

	@Autowired
    private EmployeeRepository employeeRepository;

	@Autowired
    private DepartmentRepository departmentRepository;
 }

