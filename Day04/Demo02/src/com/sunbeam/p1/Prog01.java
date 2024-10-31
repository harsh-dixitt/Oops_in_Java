package com.sunbeam.p1;

class Test {
	int n1 = 10; // Field Intializer
	int n2;
	int n3;

	// Object Initializer-2
	{
		System.out.println("Object Initializer..");
		n1 = 1000;
	}

	// constructor
	public Test() {
		System.out.println("Constructor..");
		n1 = 10000;
	}

	public void display() {
		System.out.println();
	}
}

public class Prog01 {
	public static void main(String[] args) {
		Test t1 = new Test();
		System.out.println(t1.n1);
	}
}
