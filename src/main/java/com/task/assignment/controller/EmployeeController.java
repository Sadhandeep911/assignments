package com.task.assignment.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.task.assignment.beans.Employee;

public class EmployeeController {

	
	/*
	 * @PostMapping("/employee/save") public void saveEmployeeData(Employee emp) {
	 * 
	 * }
	 */
	
	///employee/place/{place}/salary/{percentage} 
	@PutMapping("/employee/place/{place}/salary/{percentage}")
	public  void updateEmployeeData(Employee emp)	{
		
	}

}
