package com.assesement.main;

import java.util.Scanner;

import com.assesement.interfaces.EmployeeCredencials;
import com.assesement.services.CredencialService;
import com.assesement.model.Employee;

public class DriverClass {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter firstname");
		String firstName = scn.next();
		System.out.println("Please enter lastname");
		String lastName = scn.next();
		
		Employee emp = new Employee(firstName,lastName);
		
		System.out.println("Please enter department from following");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");
		
		int option = scn.nextInt();
		
		String generatedEmail = null;
		String generatedPassword = null;
		
		EmployeeCredencials ic = new CredencialService();
		
		switch (option) {
		case 1:
			generatedEmail = ic.generateEmailAddress(firstName, lastName, "tech");
			generatedPassword = ic.generatePassword();
			break;
		case 2:
			generatedEmail = ic.generateEmailAddress(firstName, lastName, "adm");
			generatedPassword = ic.generatePassword();
			break;
		case 3:
			generatedEmail = ic.generateEmailAddress(firstName, lastName, "hrs");
			generatedPassword = ic.generatePassword();
			break;
		case 4:
			generatedEmail = ic.generateEmailAddress(firstName, lastName, "lgl");
			generatedPassword = ic.generatePassword();
			break;
		default:
			System.out.println("Invalid Option Please try again !!!");
		}
		
		emp.setEmail(generatedEmail);
		emp.setPassword(generatedPassword);
		ic.showCredencials(emp);
		scn.close();

	}

}
