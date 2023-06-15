package javastudy.day02.operator;

import java.util.Scanner;

public class LogicalOperatorEx
{

	public static void main(String[] args)
	{
		// 사용자로부터 입력받은 값이
		Scanner input =  new Scanner(System.in);
		System.out.print("알파벳 대문자, 소문자 혹은 숫자를 넣어주세요");
		char ch  = input.next().charAt(0); //첫번째 문자 추출하여 판별, next() : 문자열 추출
		
		if(ch>='A'&& ch<='Z') {
			System.out.println("대문자 이군요!");
		}
		else if(ch>='a'&& ch<='z'){
			System.out.println("소문자 이군요!");
		}
		else if(ch>='0' && ch<='9') {
			System.out.println("숫자 0~9 사이 이군요!");
		}
		else {
			System.out.println("유효하지 않은 것입니다.");
		}
	}
	
}
