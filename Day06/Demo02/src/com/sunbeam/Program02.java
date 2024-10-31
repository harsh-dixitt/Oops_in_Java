package com.sunbeam;

import java.util.Scanner;

public class Program02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e = null;
		
//		e = new Salesman();
		e = new Manager();
		e.accept(sc);
		e.display();
		e.calcTotalSalary();

	}

}
