package com.sunbeam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Employee {
	
	class StuCityComparator implements Comparator<Student> {
		@Override
		public int compare(Student o1, Student o2) {
			return o1.city.compareTo(o2.city);
		}
	}

	class StuMarksComparatorDesc implements Comparator<Student>{
		@Override
		public int compare(Student o1, Student o2) {
			return Double.compare(o2.marks,o1.marks);
		}
	}

	class StuNameComparatorAsc implements Comparator<Student>{
		@Override
		public int compare(Student o1, Student o2) {
			return o1.name.compareTo(o2.name);
		}
	}
	
	public static int menu(Scanner sc) {
		System.out.println("0. EXIT");
		System.out.println("1. sorted on their city (asc)  ");
		System.out.println("2. sorted on their on marks (desc) ");
		System.out.println("3. sorted on their on name (asc) ");
		System.out.println("4. sorted on the rollno");
		return sc.nextInt();
	}
	
//	public static void displayAllStudent(Student[] arr) {
//		System.out.println("+++++++++++++++++++++++++++");
//		for (Student stu : studentList)
//			System.out.println(stu);
//		System.out.println("+++++++++++++++++++++++++++");
//	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Comparator<Student> comparator;
		List<Student> studentList= new ArrayList<Student>();
		studentList.add(new Student(1,"Harsh","Gwalior",14));
		studentList.add(new Student(6,"Messi","Rosario",10));
		studentList.add(new Student(4,"Virat","Delhi",15));
		studentList.add(new Student(3,"Rohit","Mumbai",9));
		studentList.add(new Student(2,"Gautum","Noida",11));
		studentList.add(new Student(5,"Shami","Jabalpur",14));
		

		
		int choice;
		while((choice = menu(sc))!=0) {
			switch (choice) {
			case 1:
				class NameComparator implements Comparator<String> {
					@Override
					public int compare(String o1, String o2) {
						return o2.compareTo(o1);
					}
				}
				NameComparator nameComp = new NameComparator();
				
				
				break;
				
//			case 2:
//				comparator = new StuMarksComparatorDesc();
//				Arrays.sort(studentList,comparator);
//				displayAllStudent(studentList);
//				
//			case 3:
//				comparator = new StuNameComparatorAsc();
//				Arrays.sort(studentList,comparator);
//				displayAllStudent(studentList);
//				
//			case 4:
//				Arrays.sort(studentList);
//				displayAllStudent(studentList);
//				
//			case 5:
				
				

			default:
				System.out.println("Wrong Choice....");
				break;
			}
		}

		
		

	}

}
