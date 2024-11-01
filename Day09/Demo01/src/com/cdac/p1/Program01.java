package com.cdac.p1;

//till java 1.4
class Box{
	private Object obj;

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
	
	
	
}


public class Program01 {
	
	public static void main(String[] args) {
		Box b = new Box();
		b.setObj(new String("10"));
		Integer i1 = (Integer) b.getObj();//classcastexception
		System.out.println("i1 = "+ i1);
		

	}

//	public static void main1(String[] args) {
//		Box b = new Box();
//		b.setObj(new Integer(10));
//		Integer i1 = (Integer) b.getObj();//downcasting
//		System.out.println("i1 = "+ i1);
//		
//
//	}

}
