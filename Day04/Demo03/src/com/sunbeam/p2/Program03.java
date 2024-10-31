package com.sunbeam.p2;

class Test
{
	int n1 = 10;
	static int n2 = 20;
	
	//nonstatic
	void method1()
	{
		System.out.println(n1);
		System.out.println(n2);
		//It means non static method can access static as well as non static field
	}
	
	//Static
	static void method2()
	{
//		System.out.println(n1); // NOT OK
		System.out.println(n2);
		
		// We can only access static field of class in static method
	}
}

public class Program03{
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.method1();
		
		// To call static method we have to use classname and dot(.) operator
		Test.method2();
	}
}


