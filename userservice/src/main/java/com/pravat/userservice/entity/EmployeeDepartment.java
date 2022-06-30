package com.pravat.userservice.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "employee_department")
@Data

public class EmployeeDepartment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "emp_dept_map_id", nullable = false)
    private Integer empDeptMapId;
    
    @Column(name = "employee_id")
    private Integer employeeId;
    
    @Column(name = "dept_id")
    private Integer deptId;

    
}
