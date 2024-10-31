package com.cdac.entity;

import com.cdac.exceptions.InvalidTimeException;


public class Time {
	int hr;
	int min;
	
	
	public void setHr(int hr) throws InvalidTimeException {
		if(hr < 0 || hr > 23)
			throw new InvalidTimeException("hour should be between 0 to 23");
		this.hr = hr;
	}
	public void setMin(int min) throws InvalidTimeException {
		if(min < 0 || min > 59)
			throw new InvalidTimeException("min should be between 0 to 59");
		this.min = min;
	}
	
	@Override
	public String toString() {
		return "Time [hr=" + hr + ", min=" + min + "]";
	}
}
