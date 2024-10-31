package com.cdac;

public class Program07 {

	public static void main(String[] args) {
		String s1 = "sunbeam";
		String s2 = new String("sunbeam").intern();
		
		// Firstly s2 refrence points at the object in the heap 
		//then at runtime intern method executed and s2 will now points in SLP 
		//where s1 already pointing

		System.out.println("s1==s2 - " + (s1 == s2));
	}

}
