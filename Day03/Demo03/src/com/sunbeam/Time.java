package com.sunbeam;

import java.util.Scanner;

public class Time {
//fields
	private int hr;
	private int min;
	
	public Time() {
		// TODO Auto-generated constructor stub
	}

	public Time(int hr, int min) {
		super();
		this.hr = hr;
		this.min = min;
	}

	public int getHr() {
		return hr;
	}

	public void setHr(int hr) {
		this.hr = hr;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}
	
	// Methods
	
	public void acceptTime() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the hours - ");
		hr = sc.nextInt();
		System.out.println("Enter the minutes - ");
		min = sc.nextInt();
	}
	public void displayTime(){
		System.out.println("Time = " + hr + " : " + min);
	}
	
}