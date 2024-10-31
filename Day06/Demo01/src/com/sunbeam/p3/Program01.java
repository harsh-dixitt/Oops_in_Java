package com.sunbeam.p3;

import java.util.Scanner;

class Date{
	int day;
	int month;
	int year;
	
	public Date() {

	}

	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void accept(Scanner sc) {
		System.out.println("Enter day - ");
		day = sc.nextInt();
		System.out.println("Enter month - ");
		month = sc.nextInt();
		System.out.println("Enter year - ");
		year = sc.nextInt();
		
	}
	public void display() {
		System.out.println("Day = "+day);
		System.out.println("Month = "+month);
		System.out.println("Year = "+year);
	}
	
	@Override
	public String toString() {


		return " +day  +month +year";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(obj instanceof Date) {
			Date d = (Date) obj;
			return (this.day == d.day && this.month == d.month && this.year == d.year);
		}
		return false;
	}
	
}

public class Program01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date d1 = new Date(1,1,2000);
		Date d2 = d1;
//		 Date d2 = new Date(1, 1, 2000);
//		System.out.println("(d1==d2) - " + (d1 == d2));
		System.out.println("(d1.equals(d2)) - " + (d1.equals(d2)));


	}

}
