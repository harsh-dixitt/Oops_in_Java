package com.cdac.p2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program02 {
	
	public static void division() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numerator");
		int n = sc.nextInt();
		System.out.println("Enter the denominator");
		int d = sc.nextInt();
		
		int result  = n/d;
		System.out.println("Division = "+result);
		
	}

	public static void main(String[] args) {
		
		try {
			division();
			
		}catch(ArithmeticException e){
			System.out.println("Cannot divide by 0...");
		}
		catch(InputMismatchException e1) {
			System.out.println("Wrong inputs provided...");
		}
	System.out.println("Program Completed...");
	}

}
