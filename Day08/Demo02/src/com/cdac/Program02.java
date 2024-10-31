package com.cdac;

public class Program02 {
	public static void main(String[] args) {
		String s1 = "sunbeam"; // in SLP
		String s2 = "sunbeam"; // in SLP

		String s3 = new String("sunbeam");// IN HEAP
		String s4 = new String("sunbeam"); // IN HEAP
		
		System.out.println(s1==s2);//true
		System.out.println(s3==s4);//false
		System.out.println(s1==s3);//false
		
		System.out.println("s3.equals(s4)"+(s3.equals(s4)));//true
		System.out.println("s1.equals(s3)"+(s1.equals(s3)));//true
		
		
	}	

}
