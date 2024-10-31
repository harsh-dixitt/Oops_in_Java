package com.sunbeam;

import java.util.Scanner;

public class Salesman extends Employee {
	int sales;
	double commission;

	public Salesman() {
	}

	public Salesman(int sales,double commission) {
		this.sales = sales;
	}



	public Salesman(int empid,String name,double salary,int sales, double commission) {
		super(empid,name,salary);
		this.sales = sales;
		this.commission = commission;
	}

	@Override
	public void accept(Scanner sc) {
		System.out.println("Enter sales - ");
		sales = sc.nextInt();
		super.accept(sc);
		System.out.println("Enter commission - ");
		commission = sc.nextDouble();
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Salesman sales - " + sales);
		System.out.println("Sales commission - " + commission);
	}
	
	@Override
	public void calcTotalSalary() {
		System.out.println("Total Salary of Salesman = "+(salary +(commission * sales)));
		
	}

	}


