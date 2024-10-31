package com.sunbeam;

import java.util.Scanner;

public class Person {

	String name;

	public Person() {
	}

	public Person(String name) {
		this.name = name;
	}

	public void acceptPerson(Scanner sc) {
		System.out.println("Enter name  - ");
		name = sc.next();
	}

	public void displayPerson() {
		System.out.println("Name  -  " + name);
	}
}
