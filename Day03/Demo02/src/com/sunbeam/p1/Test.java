package com.sunbeam.p1;

public class Test {

private int num1=1000;
int num2=123; // package level private
protected int num3=111;
public int num4=100;

public void display()
{
	System.out.println(num1);
	System.out.println(num2);
	System.out.println(num3);
	System.out.println(num4);	
}

}
