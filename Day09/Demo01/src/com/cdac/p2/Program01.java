package com.cdac.p2;

import java.util.Date;

//from java 1.5 onwards -> Type Safety

class Box<T> {
	private Object obj;

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public Object getObj() {
		return obj;
	}

}

public class Program01 {
	
//	public static void main(String[] args) {
//		Box<Integer> b1 = new Box<Integer>();
//		Box<Integer> b2 = new Box<>();
//		Box b3 = new Box();//not recommended
//		Box b4 = new Box<>();// raw type not recommended
//	}
	
//------------------------------------------------------

	
//	public static void main3(String[] args) {
//		Box<Double> b1 = new Box<Double>();
//		b1.setObj(new Double(10.12));
//		// b1.setObj(new Integer(10)); // NOT OK
//
//		Box<String> b2 = new Box<String>();
//		b2.setObj(new String("sunbeam"));
//
//		Box<Date> b3 = new Box<Date>();
//		b3.setObj(new Date());
//
//		Double d1 = (Double) b1.getObj();
//		String s = (String) b2.getObj();
//		Date d = (Date) b3.getObj();
//		
//		System.out.println(d1);
//		System.out.println(s);
//		System.out.println(d);
//	}
	
	
//------------------------------------------------------
	
//	public static void main2(String[] args) {
//		Box<Integer> b1 = new Box<Integer>();
//		// b1.setObj(new String("10")); // NOT OK
//		b1.setObj(new Integer(20));
//		Integer i1 = (Integer) b1.getObj();
//		System.out.println("i1 = " + i1);
//
//	}

//------------------------------------------------------
	
//	public static void main1(String[] args) {
//		Box<Integer> b1 = new Box<Integer>();
//		b1.setObj(new Integer(10));
//		Integer i1 = (Integer) b1.getObj();
//		System.out.println("i1 = " + i1);
//
//	}

}
//------------------------------------------------------
