package com.cdac.p3;

//Bounded type parameter

class Box<T extends Number>{
	
	private T obj;
	
	
	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	
	
	
}

public class Program01 {

	public static void main(String[] args) {
		Box<Number> b1 = new Box<>();
		b1.setObj(1000);
		
		Number n1 = b1.getObj();
		System.out.println("n1 - "+n1);
		
		Box<Integer> b2 = new Box<>();
		b2.setObj(1000);
		Integer i1 = b2.getObj();
		System.out.println("i1 - "+i1);
		
		Box<Double> b3 = new Box<>();
		b3.setObj(10.12);
		Double d1 = b3.getObj();
		System.out.println("d1 - "+d1);
		// Box<String> b4 = new Box<>(); // NOT OK
		// Box<Date> b4 = new Box<>(); // NOT OK
		Box<Short> b4 = new Box<>();//ok

		
		
		

	}

}
