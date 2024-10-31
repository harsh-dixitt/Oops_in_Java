package com.sunbeam;

import java.util.Scanner;

public  abstract class Employee {
	int empid;
	String name;
	double salary;

	public Employee() {
	}

	public Employee(int empid, String name, double salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	public void accept(Scanner sc) {
		System.out.println("Enter employee id - ");
		empid = sc.nextInt();
		System.out.println("Enter employee name - ");
		name = sc.next();
		System.out.println("Enter employee salary - ");
		salary = sc.nextDouble();
	}

	public void display() {
		System.out.println("Employee ID - " + empid);
		System.out.println("Employee name - " + name);
		System.out.println("Employee salary - " + salary);
	}

	// implemention of the method is 100% incomplete
	public abstract void calcTotalSalary();

}
