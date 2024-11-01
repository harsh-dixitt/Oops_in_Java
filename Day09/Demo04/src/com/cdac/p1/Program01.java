package com.cdac.p1;

// this is our date class
class Date{
	int day;
	int month;
	int year;
	
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}


	public Date() {
	}
	
	@Override
	public String toString() {	
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}	
}

//this is our employee class

class Employee{
	String name;
	double salary;
	Date doj;
	
	public Employee() {
		doj = new Date();
	}

	public Employee(String name, double salary, int day , int month , int year) {
		this.name = name;
		this.salary = salary;
		this.doj = new Date(day,month,year);
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", doj=" + doj + "]";
	}
	
	
}


public class Program01 {

	public static void main(String[] args) {
		Employee e1 = new Employee("Virat",11211,1,2,2003);
		System.out.println("e1 = "+e1);
		Employee e2 = e1; //Both refrences points at same employee object
		System.out.println("e2 = "+e2);
		
		// So if we change any of the field change will reflect on both refrences.
		System.out.println("After change in e2 ");
		e2.name = "Rohit";
		System.out.println("e1 = "+e1);
		System.out.println("e2 = "+e2);
		

	}

}
