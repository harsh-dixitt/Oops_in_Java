package com.sunbeam.p2;

import java.util.Scanner;

class Date {
	int day;
	int month;
	int year;

	public Date() {

	}

	public Date(int day, int month, int year) {
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

	public static void main1(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date d1 = new Date();
		Date d2 = new Date();

		System.out.println("(d1==d2) - " + (d1 == d2));
	}

	public static void main(String[] args) {
		Date d1 = new Date();
		Date d2 = d1;

		System.out.println("(d1==d2) - " + (d1 == d2)); // true

	}
}
