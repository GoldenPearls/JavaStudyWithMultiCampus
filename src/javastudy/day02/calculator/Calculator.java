package javastudy.day02.calculator;

import java.lang.System;

public class Calculator
{
	public static void main(String[] args) {
	int x = 1;
	int y = 2;
	
	int result = x+y;
	
	System.out.printf("x = %d y= %d result = %d",x, y, result);
	
	boolean result1;
	result1 = (x==20);
	System.out.println(result1);
	
	result1 = (x!=20);
	System.out.println(result1);
	
	result1=(x>20);
	System.out.println(result1);
	
	result1=(x>0 && x<20);
	System.out.println(result1);
	
	result1=(x<0 ||x>200);
	System.out.println(result1);
	
	
	}
}
