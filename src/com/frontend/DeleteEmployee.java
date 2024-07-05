package com.frontend;

import com.controller.EmployeeController;

public class DeleteEmployee {

	public static void main(String[] args) {
		EmployeeController controller = new EmployeeController();
		String msg=controller.deleteEmployee();
		System.out.println(msg);
	}

}
