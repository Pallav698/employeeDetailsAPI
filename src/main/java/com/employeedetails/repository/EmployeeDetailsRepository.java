package com.employeedetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeedetails.model.EmployeeDetails;

public interface EmployeeDetailsRepository  extends JpaRepository<EmployeeDetails, Integer>{

}
