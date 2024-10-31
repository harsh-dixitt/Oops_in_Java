package com.sunbeam;

import java.util.Scanner;

public class Employee extends Person {
	
	int empid;
	double salary;
	
	public Employee() {
		System.out.println("Employee parameterless ctor");
	}
	
	

	public Employee(int empid, double salary) {
		this.empid = empid;
		this.salary = salary;
	}
	
					



	public Employee(int empid, String name, double salary) {
		super(name);
		this.empid = empid;
		this.salary = salary;
	}
	
	public void acceptEmployee(Scanner sc) {
		System.out.println("Enter employee id = ");
		empid = sc.nextInt();
		
		this.acceptPerson(sc);
		System.out.println("Enter salary = ");
		salary = sc.nextDouble();
		
	}
	
	public void displayEmployee() {
		System.out.println("Empid = "+empid);
		displayPerson();
		System.out.println("Salary = "+salary);
	}

}
