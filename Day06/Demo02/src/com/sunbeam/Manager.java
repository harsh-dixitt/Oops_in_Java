package com.sunbeam;

import java.util.Scanner;

public class Manager extends Employee {
	double bonus;

	public Manager() {
	}

	public Manager(double bonus) {
		this.bonus = bonus;
	}

	public Manager(int empid, String name, double salary, double bonus) {
		super(empid, name, salary);
		this.bonus = bonus;

	}

	@Override
	public void accept(Scanner sc) {
		System.out.println("Enter manager bonus - ");
		bonus = sc.nextDouble();
		super.accept(sc);
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Manager bonus - " + bonus);
	}

	@Override
	public void calcTotalSalary() {
		System.out.println("Total salary = " + (salary + bonus));
		
	}

}
