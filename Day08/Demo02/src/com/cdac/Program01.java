package com.cdac;

public class Program01 {
	public static void main(String[] args) {
		String s1 = "Harsh"; // In SLP
		String s2 = new String("Harsh"); // In heap
		
		System.out.println(s1==s2);//false
		
		String s3 = "sunbeam"; // SLP
		String s4 = new String("sunbeam"); // heap
		
	}

}
