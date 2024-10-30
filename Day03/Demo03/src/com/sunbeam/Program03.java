package com.sunbeam;

public class Program03 {

	public static void main(String[] args) {
		Time t1 = new Time();
//		t1.displayTime();
		
		Time t2 = new Time(10,10);
		t2.displayTime();
		
		t1.acceptTime();
		t1.displayTime();

	}

}
