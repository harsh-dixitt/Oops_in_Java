package com.sunbeam;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		Employee e1 = new Manager(1,"Harsh",200000,80000);
//		e1.display();
		
		
		Employee e2 = new Salesman(1,"Harsh",200000,80,120);
		e2.display();
		

	}

}
