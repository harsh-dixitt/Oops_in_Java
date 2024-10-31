
package com.sunbeam.p1;

class Circle {
	int radius;
	static final double PI = 3.14;
	
	public Circle (int radius) {
		this.radius = radius;
	}
	
	public void calcArea() {
		System.out.println("Area - " + (PI * radius * radius));
	}
}

public class Program02 {

public static void main(String[] args) {
	System.out.println("n2 = " + Test.n2);
}

}