package com.controller;

import com.entity.Employee;
import com.service.EmployeeService;

public class EmployeeController {
	EmployeeService service = new EmployeeService();
	
	public void getEmployee() {
		service.getEmployee();
	}
	
	public String addEmployee(Employee e) {
		return service.addEmployee(e);
	}

	public void getEmployeeSalaryMoreThanTwentyK() {
		service.getEmployeeSalaryMoreThanTwentyK(); 
		
	}

	public void getEmployeeHavngSalaryFiftyOneK() {
		service.getEmployeeHavngSalaryFiftyOneK(); 
		
	}
	
	public void getEmployeeHavngAgeMoreThanThirtyFive(){
		service.getEmployeeHavngAgeMoreThanThirtyFive(); 
		
	}

	public void getEmployeeHavingDevProfile() {
		service.getEmployeeHavingDevProfile();
		
	}

	public void getEmployeeHavingTestProfile() {
		service.getEmployeeHavingTestProfile();
		
	}

	public void getEmployeeHavngSalaryTwentyFiveAndMore() {
		service.getEmployeeHavngSalaryTwentyFiveAndMore();
		
	}

	public void getEmployeeNotHavngSalaryFiftyOneK() {
		service.getEmployeeNotHavngSalaryFiftyOneK();
		
	}

	public void updateEmployeeSalaryHavingExperienceLessThanTwenty() {
		service.updateEmployeeSalaryHavingExperienceLessThanTwenty();
		
	}

	public String deleteEmployee() {
		return service.deleteEmployee();
		
	}

	public void updateSalaryJohn() {
		service.updateSalaryJohn();
		
	}
}
