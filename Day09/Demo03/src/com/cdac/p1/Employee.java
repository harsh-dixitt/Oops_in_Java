package com.cdac.p1;

public class Employee implements Comparable<Employee> {
	int empid;
	String name;
	double salary;

	public Employee() {
	}

	public Employee(int empid, String name, double salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}

//	@Override
//	public int compareTo(Employee o) {
//		return this.empid - o.empid; //empid in ascending order
//	}
	
	@Override
	public int compareTo(Employee o) {
		return o.empid - this.empid; //empid in desc order
	}

//	@Override
//	public int compareTo(Employee o) {
//		return this.name.compareTo(o.name); // for name in alphabetical order
//	}

//	@Override
//	public int compareTo(Employee o) {
//		return Double.compare(o.salary, this.salary); // for salary in descending order
//	}

}
