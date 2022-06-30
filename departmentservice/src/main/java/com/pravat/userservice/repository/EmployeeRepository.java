package com.pravat.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pravat.userservice.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


}