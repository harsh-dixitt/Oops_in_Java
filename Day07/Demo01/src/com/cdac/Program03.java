package com.cdac;

import java.util.Scanner;

interface Shape{
	double PI = 3.14;
	
	void acceptData(Scanner sc);
	void calcArea();
}

class Rectangle implements Shape{
	double length;
	double breadth;
	
	@Override
	public void acceptData(Scanner sc) {
		System.out.println("Enter rectangle length - ");
		length = sc.nextDouble();
		System.out.println("Enter rectangle breadth - ");
		breadth = sc.nextDouble();
	}
	@Override
	public void calcArea() {
		double result;
		result = (length * breadth);
		System.out.println("Area of Rectangle = "+result);
		
	}	
	}

class Circle implements Shape{
	double radius;
	
	@Override
	public void acceptData(Scanner sc) {
		System.out.println("Enter Circle Radius - ");
		radius = sc.nextDouble();
	}
	
	@Override
	public void calcArea() {
		System.out.println("Area of circle = "+(PI * radius * radius));
		
	}
}


public class Program03 {
	
	public static int menu(Scanner sc) {
		System.out.println("0. EXIT");
		System.out.println("1. AREA OF RECTANGLE");
		System.out.println("2. AREA OF CIRCLE");
		System.out.println("ENTER CHOICE -> ");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Shape s = null;
		int choice;
		while((choice = menu(sc))!=0) {
			switch (choice) {
			case 1:
				s =  new Rectangle();
				break;
			case 2:
				s = new Circle();
				break;

			default:
				System.out.println("Wrong Choice Try Again...");
				break;
			}
			if (s!=null) {
				s.acceptData(sc);
				s.calcArea();
				s = null;
			}
		}
	}

}
