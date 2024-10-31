package com.sunbeam.p1;

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
	
	@Override
	public String toString() {
		return day + "/" + month + "/" + year;
	}
}

public class Program01 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Date d1 = new Date();
			Date d2 = new Date(1,1,2000);
			System.out.println("d1 = " + d1.toString());
			
			System.out.println("d2 = " + d2.toString());
			
//			System.out.println("Date 1 = "+d1.toString());
			
//			System.out.println("Date 2 = "+d2.toString());
	}

}
