package com.sunbeam;

import java.util.Scanner;

public class Car {

		String name;
		String number;
		
		public Car() {
			
		}
		
		public Car(String name , String number) {
			this.name = name;
			this.number = number;
		}
		
		public void acceptCar(Scanner sc) {
			System.out.println("Enter car name -  ");
			name = sc.next();
			System.out.println("Enter car number -  ");
			number = sc.next();
			
		}
		public void displayCar() {
			System.out.print("Car name = "+name);
			System.out.print("Car number = "+number);
		}
		
		

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Car c1 = new Car();
		c1.acceptCar(sc);
		c1.displayCar();
		

	}

}
