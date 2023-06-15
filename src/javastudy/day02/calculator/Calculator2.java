package javastudy.day02.calculator;

import java.lang.System;
import java.util.Scanner;

public class Calculator2
{
	public static void main(String[] args) {
		// 변수 num1, num2, result
		int num1=0, num2=0, result=0;
		
		//사용자한테 숫자를 입력받도록
		//()안에는 들어오는 곳을 지정 in : 키보드
		Scanner input = new Scanner(System.in); //ctrl+shift+o
		
		//menu
		System.out.println("=====Calculator ver.2=====");
		
		// 반복적으로 사용이 가능하며, 끝내기인 0을 누르기 전까지는 계속 반복
		while(true) { //무한루프이므로 반드시 끝내기 기능이 필수
			System.out.println();
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1. 더하기");
			System.out.println("2. 빼기");
			System.out.println("3. 곱하기");
			System.out.println("4. 나누기");
			System.out.println("0. 끝내기");
			
			int num = input.nextInt();
			
			if(num == 0) {
				System.out.println("끝내기를 선택하셨어요. 계산을 종료할게요.");
				break;
			}
			else {
				if(num>4) {
					System.out.println("메뉴 선택을 잘못 선택하셨어요");
					continue; //다시 돌아감
				}
				else {
					System.out.println("첫 번째 숫자를 입력하세요.");
					num1 = input.nextInt();
					System.out.println("두 번째 숫자를 입력하세요.");
					num2 = input.nextInt();
					
					// 확인하기 위한 코드 
					// 문장열 비교하는 특수 메소드 : equals 사용
					
					 if (num==1) {
						 	result = num1 + num2;
				            System.out.printf("%d + %d = %d\n", num1, num2, result);
				        } else if (num==2) {
				        	result = num1 - num2;
				        	System.out.printf("%d - %d = %d\n", num1, num2, result);
				        } else if (num==3) {
				        	result = num1 * num2;
				        	System.out.printf("%d * %d = %d\n", num1, num2, result);
				        } else if (num==4) {
				        	result = num1 / num2;
				        	System.out.printf("%d / %d = %d\n", num1, num2, result);
				        } else {
				            System.out.println("해당 연산자는 지원이 되지 않습니다. 올바른 연산 기호를 선택해세요:D");
				        }
				}
			}
			System.out.println("해당 연산을 종료합니다.");
			
		}
	}
}