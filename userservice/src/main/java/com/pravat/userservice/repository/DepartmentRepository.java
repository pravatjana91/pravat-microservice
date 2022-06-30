package com.pravat.userservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pravat.userservice.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {


}