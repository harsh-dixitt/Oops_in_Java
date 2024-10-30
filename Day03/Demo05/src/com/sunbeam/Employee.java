package com.sunbeam;

public class Employee {
		int empid;
		String name;
		double salary;
		
		
		public Employee() {
			this(00,"Unknown",0000)
		}


		public Employee(int empid, String name, double salary) {
			this.empid = empid;
			this.name = name;
			this.salary = salary;
		}
		
		
		
		public int getEmpid() {
			return empid;
		}


		public void setEmpid(int empid) {
			this.empid = empid;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public double getSalary() {
			return salary;
		}


		public void setSalary(double salary) {
			this.salary = salary;
		}


		public void displayEmployee()
		{
			System.out.println("Empid = " +empid);
			System.out.println("Name = " +name);
			System.out.println("Salary = " +salary);
			
		}

}
