package javastudy.day02.calculator;

import java.lang.System;
import java.util.Scanner;

public class Calculator1
{
	public static void main(String[] args) {
	
		// 변수 num1, num2, result
		int num1=0, num2=0, result=0;
		String op = "";
		
		//사용자한테 숫자를 입력받도록
		//()안에는 들어오는 곳을 지정 in : 키보드
		Scanner input = new Scanner(System.in); //ctrl+shift+o
		
		System.out.println("=====Calculator ver.1=====");
		System.out.println("첫 번째 숫자를 입력하세요.");
		num1 = input.nextInt();
		System.out.println("두 번째 숫자를 입력하세요.");
		num2 = input.nextInt();
		System.out.println("연산의 종류는 +, -, *, / 기호 중 한 가지를 선택해주세요.");
		op = input.next();
		
		// 확인하기 위한 코드 
		// 문장열 비교하는 특수 메소드 : equals 사용
		System.out.println(num1+" "+num2 +" "+ op);
		
		 if (op.equals("+")) {
			 	result = num1 + num2;
	            System.out.printf("%d + %d = %d\n", num1, num2, result);
	        } else if (op.equals("-")) {
	        	result = num1 - num2;
	        	System.out.printf("%d - %d = %d\n", num1, num2, result);
	        } else if (op.equals("*")) {
	        	result = num1 * num2;
	        	System.out.printf("%d * %d = %d\n", num1, num2, result);
	        } else if (op.equals("/")) {
	        	result = num1 / num2;
	        	System.out.printf("%d / %d = %d\n", num1, num2, result);
	        } else {
	            System.out.println("올바른 연산 기호를 선택해세요");
	        }
	}
}