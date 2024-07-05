package com.service;

import com.dao.EmployeeDao;
import com.entity.Employee;

public class EmployeeService {
	EmployeeDao dao= new EmployeeDao();
	
	public void getEmployee() {
		dao.getEmployees();
	}
	
	public String addEmployee(Employee e) {
		
		dao.addEmployee(e);
		
		if(true) {
			return "Employee added Sucessfully";	
		} else
			return "Employee not added";
		
	}

	public void getEmployeeSalaryMoreThanTwentyK() {
		dao.getEmployeeSalaryMoreThanTwentyK();
		
	}

	public void getEmployeeHavngSalaryFiftyOneK() {
		dao.getEmployeeHavngSalaryFiftyOneK();
		
	}

	public void getEmployeeHavngAgeMoreThanThirtyFive() {
		dao.getEmployeeHavngAgeMoreThanThirtyFive();
		
	}

	public void getEmployeeHavingDevProfile() {
		dao. getEmployeeHavingDevProfile();
	}

	public void getEmployeeHavingTestProfile() {
		dao. getEmployeeHavingTestProfile();
		
	}

	public void getEmployeeHavngSalaryTwentyFiveAndMore() {
		dao. getEmployeeHavngSalaryTwentyFiveAndMore();
		
	}

	public void getEmployeeNotHavngSalaryFiftyOneK() {
		dao.getEmployeeNotHavngSalaryFiftyOneK();
		
	}

	public void updateEmployeeSalaryHavingExperienceLessThanTwenty() {
		dao.updateEmployeeSalaryHavingExperienceLessThanTwenty();
		
	}

	public String deleteEmployee() {
		dao.deleteEmployee();
		
		if(true) {
			return "Employee deleted Sucessfully";	
		} else
			return "Employee not deleted";
		
		
	}

	public void updateSalaryJohn() {
		dao.updateSalaryJohn();
		
	}
}
