package com.sunbeam;

public class Program02 {
	
	
	public static void square(int n) {
		System.out.println("Square = " + (n * n));
	}
	
	public static void square(double n) {
		System.out.println("Square = " + (n * n));
	}
	
	public static void multiply(int n1 , int n2 , int n3) {
		System.out.println("Square = " + (n1 * n2 * n3));
	}
	
	public static void multiply(int n1 , int n2 , int n3 , int n4) {
		System.out.println("Square = " + (n1 * n2 * n3 * n4));
	}
	
	public static void divide(double n1 , int n2) {
		System.out.println("Division = " +(n1/n2));
	}
	
	public static void divide(int n1 , double n2) {
		System.out.println("Division = " +(n1/n2));
	}


	public static void main(String[] args) {
		square(5);
		square(5.5);
		multiply(3, 4 , 8);
		multiply(3, 4, 5 ,2);
		divide(10.5, 2);
		divide(12, 5.5);


	}

}
