package com.cdac;


public class Program06 {

	public static void main(String[] args) {
		String s1 = "sunbeam";
		String s2 = "sun".concat("beam");//at runtime concat method will execute

		System.out.println("s1==s2 - " + (s1 == s2));
		System.out.println("s1.equals(s2) = "+(s1.equals(s2)));

	}

}

