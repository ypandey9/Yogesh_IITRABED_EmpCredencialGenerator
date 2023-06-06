package com.assesement.interfaces;

import com.assesement.model.Employee;

public interface EmployeeCredencials {
	
	public String generateEmailAddress(String firstName, String lastName, String department);

	public String generatePassword();

	public void showCredencials(Employee emp);
}
