package com.cdac;

import java.util.Scanner;

interface Acceptable {
	void accept(Scanner sc);
}

interface Displayable {
	void display();
}

class Employee implements Acceptable, Displayable {
	int empid;
	String name;
	double salary;

	@Override
	public void accept(Scanner sc) {
		System.out.println("Enter id - ");
		empid = sc.nextInt();
		System.out.println("Enter name - ");
		name = sc.next();
		System.out.println("Enter salary - ");
		salary = sc.nextDouble();
	}

	public void display() {
		System.out.println("ID = " + empid);
		System.out.println("Name = " + name);
		System.out.println("Salary = " + salary);
	}

}

class Point implements Acceptable, Displayable {
	int x;
	int y;

	@Override
	public void accept(Scanner sc) {
		System.out.println("Enter x coordinate - ");
		x = sc.nextInt();
		System.out.println("Enter y coordinate - ");
		y = sc.nextInt();
	}

	public void display() {
		System.out.println("X axis = " + x);
		System.out.println("Y axis = " + y);

	}
}

public class Program01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		Employee e1 = new Employee();
//		e1.accept(sc);
//		e1.display();
		
//		Point p1 = new Point();
//		p1.accept(sc);
//		p1.display();
		
		Acceptable a1 = new Employee();
		a1.accept(sc);
		

	}

}
