package com.cdac.tester;

import com.cdac.entity.Date;
import com.cdac.exceptions.InvalidDateException;


public class Program01 {
	public static void main(String[] args) {
		Date d = new Date();
		try {
			d.setDay(122);
			d.setMonth(12);
			d.setYear(2024);
		}catch(InvalidDateException e) {
			e.printStackTrace();
		}
		System.out.println(d);
	}
}
