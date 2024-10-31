package com.sunbeam;

import java.util.Scanner;

public class Employee {
	
	int empid;
	String name;
	double salary;
	
	Date doj; // Association 
	
	{
		doj  = new Date(); //Composition
	}
	
	public Employee() {
		
	}
	
	public Employee(int empid,String name,double salary , int day , int month , int year) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		
		doj.day  =  day;
		doj.month = month;
		doj.year = year;
		
	}
	
	public void acceptEmployee(Scanner sc) {
		System.out.println("Enter the empid -  ");
		empid = sc.nextInt();
		System.out.println("Enter the name -  ");
		name = sc.next();
		System.out.println("Enter the salary -  ");
		salary = sc.nextDouble();
		System.out.println("Enter the Date of joining -  ");
		doj.acceptDate(sc);
		
	}
	
	public void displayEmployee() {
		System.out.println("Empid - " + empid);
		System.out.println("Name - " + name);
		System.out.println("Salary - " + salary);
		System.out.println("Date of joining - " +doj.getDetails());
	}
	
	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		Employee e1 = new Employee();
		e1.acceptEmployee(sc);
		e1.displayEmployee();

	}

}
