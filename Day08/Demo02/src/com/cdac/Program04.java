package com.cdac;


public class Program04 {

	public static void main(String[] args) {
		String s1 = "sunbeam";//in SLP
		String s2 = "sun";//IN SLP
		String s3 = s2 + "beam"; // new String("sunbeam"); // OBJECT CREATE HOGA

		System.out.println("s1==s3 - " + (s1 == s3));//FALSE
		System.out.println("s1.equals(s3) - " + (s1.equals(s3)));//TRUE

	}

}

