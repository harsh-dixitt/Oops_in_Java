package com.cdac.tester;

import com.cdac.exceptions.InvalidTimeException;
import com.cdac.entity.Time;

public class Program02 {

	public static void main(String[] args) {
		Time t = new Time();
		try {
			t.setHr(24);
			t.setMin(12);
			System.out.println(t);
		}catch(InvalidTimeException e){
			e.printStackTrace();
		}
		

	}

}
