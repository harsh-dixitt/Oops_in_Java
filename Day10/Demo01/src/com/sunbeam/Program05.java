package com.sunbeam;

import java.util.ArrayList;
import java.util.Collection;

public class Program05 {

	public static void main(String[] args) {
		Collection<Employee> e1 = new ArrayList<Employee>();
		e1.add(new Employee(1, "Anil", 10000));
		e1.add(new Employee(2, "Mukesh", 20000));
		e1.add(new Employee(3, "Ramesh", 30000));
		e1.add(new Employee(4, "Suresh", 40000));
		e1.add(new Employee(5, "Sham", 50000));
		
		for(Employee employee : e1)
			System.out.println(employee);
		
		Employee emp = new Employee();
		emp.empid = 3;
		
		System.out.println("Employee Found - "+e1.contains(emp));
		
		System.out.println("Employee removed - "+e1.remove(emp));
		
		System.out.println("Total Elements - "+e1.size());
	}

}
