package com.sunbeam;

import java.util.Scanner;

public class Date {
	
	int day;
	int month;
	int year;
	
	public Date() {		
	}
	
	public Date(int day , int month , int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void acceptDate(Scanner sc) {
		System.out.println("Enter the day - ");
		day = sc.nextInt();
		System.out.println("Enter the month - ");
		month = sc.nextInt();
		System.out.println("Enter the year - ");
		year = sc.nextInt();
	}
	
	public String getDetails() {
		return day + "/" +month + "/" + year;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date d1 = new Date();
		d1.acceptDate(sc);
		System.out.println(d1.getDetails());
	}

}
