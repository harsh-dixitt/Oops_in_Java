package com.sunbeam;

public class Program01 {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.displayEmployee();
		
		Employee e2 = new Employee(1,"Harsh",1000);
        e2.displayEmployee();
	}
}
