package com.sunbeam;

public class Prog05 {

	public static void add(int[] arr) {
		int result = 0;
//		for (int e : arr)
//			result += e;
		
		for(int i = 0; i < arr.length; i++) {
			result = result + arr[i];
		}
		System.out.println("Addition = " + result);
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 10, 20 };
		add(arr);

		arr = new int[] { 10, 20, 30 };
		add(arr);

		add(new int[] { 10, 20, 30, 40 });

		// add(10, 20, 30, 40, 50);// NOT OKs

	}
}

