package com.cdac;

import java.util.Scanner;

interface Printable{
	void display();	
}
interface Showable{
	void display();
}

class Test implements Printable, Showable,Acceptable{
	@Override
	public void display() {	
	}
	@Override
	public void accept(Scanner sc) {

	}
}

public class Program04 {

	public static void main(String[] args) {
		Acceptable a  = new Test(); // upcasting 
		a.accept(null);
		// Printable p = (Printable) a;
		Object obj = (Object) a;
		Displayable p = (Displayable) a; // classcastexception
		p.display();

	}

}
