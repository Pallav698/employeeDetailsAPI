package com.employeedetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.employeedetails.model.EmployeeDetails;
import com.employeedetails.service.EmployeeDetailsService;

public class EmployeeDetailsController {
	
	@Autowired
	EmployeeDetailsService employeeDetailsService;
	
	//get data from database
	@GetMapping("/employeeDetails")
	private List<EmployeeDetails> getAllEmployee(){
		return employeeDetailsService.getAllEmployee();
	}
	
	
	//save data into the database
	@PostMapping("/employeeDetails")  
	private EmployeeDetails saveEmployee(@RequestBody EmployeeDetails EmployeeDetails)   
	{  
	return employeeDetailsService.saveOrUpdate(EmployeeDetails);  
	}  
	
	//get data by ID
	@GetMapping("/employeeDetails/{empCode}")  
	private EmployeeDetails getEmployeeById(@PathVariable("employee_details_code") int employee_details_code)   
	{  
	return employeeDetailsService.getEmployeeById(employee_details_code);  
	}  
	
	//delete data
	@DeleteMapping("/employeeDetails/{empCode}")  
	private void deleteBook(@PathVariable("empCode") int employee_details_code)   
	{  
		employeeDetailsService.delete(employee_details_code);  
	}  
	
	//edit data
	@PutMapping("/employeeDetails")  
	private EmployeeDetails update(@RequestBody EmployeeDetails EmployeeDetails)   
	{  
		employeeDetailsService.saveOrUpdate(EmployeeDetails);  
	return EmployeeDetails;  
	}  
	
	
}
