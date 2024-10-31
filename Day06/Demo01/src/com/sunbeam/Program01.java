package com.sunbeam;

import java.util.Scanner;

class Date{
	int day;
	int month;
	int year;
	
	public Date() {
		
	}
	
	public Date(int day,int month,int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void accept(Scanner sc) {
		System.out.println("Enter day = ");
		day  = sc.nextInt();
		System.out.println("Enter month = ");
		month = sc.nextInt();
		System.out.println("ENter year = ");
		year = sc.nextInt();
	}
	
	public void display() {
		System.out.println("Day = "+day);
		System.out.println("Month = "+month);
		System.out.println("year = "+year);
	}
}


