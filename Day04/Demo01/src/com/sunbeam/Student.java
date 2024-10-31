package com.sunbeam;

public class Student {
	//fields
	int rollno;
	String name;
	double marks;

	//parameterless ctor
	public Student() {
	}
	
	// Parameterized ctor
	public Student(int rollno, String name, double marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	public void display() {
		System.out.println("Rollno - " + rollno);
		System.out.println("Name - " + name);
		System.out.println("Marks - " + marks);
	}
}

