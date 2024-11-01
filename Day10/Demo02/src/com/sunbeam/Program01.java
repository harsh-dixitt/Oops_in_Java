package com.sunbeam;

import java.util.ArrayList;
import java.util.List;

public class Program01 {

	public static void main(String[] args) {
		List<String> nameList = new ArrayList<String>();
		nameList.add("Suarez");
		nameList.add("Neymar");
		nameList.add("Messi");
		nameList.add("Xavi");
		nameList.add("Busquests");
		nameList.add("Messi");
		
		for(String str : nameList)
			System.out.print(" "+str);
		
		
		System.out.println();
		
		System.out.println("Total Elements - "+nameList.size());
		
		System.out.println("Element at index 2 - "+nameList.get(2));
		
		System.out.println("Index of Messi - "+nameList.indexOf("Messi"));
		
		System.out.println("Last Index of Messi - "+nameList.lastIndexOf("Messi"));

		System.out.println("Name found - "+nameList.contains("Xavi"));
		
		System.out.println("Removing Xavi.."+nameList.remove("Xavi"));
		
		System.out.println("Total Elements - "+nameList.size());
		
		for(String str : nameList)
			System.out.print(" "+str);
	}

}
