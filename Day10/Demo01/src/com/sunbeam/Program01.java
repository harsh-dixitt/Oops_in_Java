package com.sunbeam;

import java.util.ArrayList;
import java.util.Collection;

public class Program01 {

	public static void main(String[] args) {
		Collection<Integer> c1 = new ArrayList<Integer>();
		// we can also use
		// Collection<Integer> c1 = new LinkedList<Integer>();
		// Collection<Integer> c1 = new LinkedHashSet<Integer>();

		c1.add(10);
		c1.add(20);
		c1.add(30);
		c1.add(40);
		c1.add(50);

		System.out.println("Total Elements - " + c1.size());

		System.out.println("Element found - " + c1.contains(20));
		System.out.println("Element found - " + c1.contains(60));

		System.out.println("Is Empty - " + c1.isEmpty());

		c1.remove(10);

		System.out.println("Total Elements - " + c1.size());
		
		// using for each loop to traverse the elements 
		for (Integer employee : c1)
			System.out.print(" " + employee);

	}

}
