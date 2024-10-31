package com.sunbeam.p1;

class Test{
	int n1;
	// final int n2 = 20; //ok
	final int n2;
//	n2 =100;
	
	//Object Intializer 
	{
//		n2 = 100;
	}
	
	public Test() {
		n2 = 1000;
		this = new Test();
	}
}



public class Prog03 {

	public static void main(String[] args) {
		final Test t1;
		t1 = new Test();
		t1 = new Test();
		

	}

}
