package com.cdac.entity;

import com.cdac.exceptions.InvalidDateException;

public class Date {
	int day;
	int month;
	int year;
	
	
	public void setDay(int day) {
		if(day < 0 || day > 31)
			throw new InvalidDateException("Day should be in the range of 1 to 31");
		this.day = day;
	}
	public void setMonth(int month) {
		if(month < 0 || month > 12)
			throw new InvalidDateException("Month should be between 1 and 12");
		this.month = month;
	}
	public void setYear(int year) {
		if(year < 2000 || year > 2100)
			throw new InvalidDateException("Year should be between 2000 and 2100");
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	

}
