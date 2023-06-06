package com.assesement.services;

import java.util.Random;
import com.assesement.model.Employee;
import com.assesement.interfaces.EmployeeCredencials;

public class CredencialService implements EmployeeCredencials {

	@Override
	public String generateEmailAddress(String firstName, String lastName, String department) {

		return firstName + lastName + "@" + department + ".gl.com";
	}

	@Override
	public String generatePassword() {
		
		String password = "";
		String charLower = "abcdefghijklmnopqrstuvwxyz";
		String charUpper = charLower.toUpperCase();
		String numbers = "0123456789";
		String specialChars = "!@#$%^&*()_+-=[]{}|;':,.<>?";
		String values = charUpper + charLower + numbers + specialChars;
		
		Random random = new Random();
		
		for (int i = 0; i < 8; i++) {
			int index = random.nextInt(values.length());
			// System.out.println(index);
			char c = values.charAt(index);
			password += String.valueOf(c);
			// System.out.println("Password "+index);
		}
		return password;
	}

	@Override
	public void showCredencials(Employee emp) {
		System.out.println("");
		System.out.println("Hi " + emp.getFirstName() + " " + emp.getLastName() + " followings are the creadencials");
		System.out.println("Email is : " + emp.getEmail());
		System.out.println("Password is : " + emp.getPassword());

	}

}
