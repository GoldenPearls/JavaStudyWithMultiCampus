package javastudy.day01;

public class Ex01_VariableType
{

	public static void main(String[] args)
	{
		/* 1. 숫자형
		 * byte num1 = 1; short num2 = 1; int num3 = 1; //기본 자료형 long num4 = 1;
		 * 
		 * System.out.println(num1); System.out.println(num2); System.out.println(num3);
		 * System.out.println(num4);
		 */
		
		// 2. 문자형 char/2byte / 유니코드(다양한 언어를 지원하는 코드 셋)와 아스키코드(128개, 영문자, 숫자, 특수문자)
		// 인코딩과 디코딩 ==> 
		//'A' ==> 이진수로 바꾸면 0000 0000 0100 0001(인코딩)
		// 0000 0000 0100 0001 ==> 'A'(디코딩)
		// 전부 사람이 볼 수 있는 A로 바꿔서 출력함
		/*
		 * char ch1='A'; char ch2=65; char ch3 = 0x41; char ch4 = 0b00000001000001;
		 * 
		 * System.out.println(ch1); System.out.println(ch2); System.out.println(ch3);
		 * System.out.println(ch4);
		 */
		// 3. 논리형 : 어떤 변수의 참, 거짓의 값을 나타내는데 사용 boolean/1byte
		
		/* boolean check1 = true;
		boolean check2 = false;
		
		boolean check3 = (1<2);
		
		System.out.println(check3); */
		
		int a= 20, b=30;
		System.out.print(a +""+ b); //가능
		
		final int speed = 20;
		
		final double PI = 3.14;
		int r = 20;
		int result = (int)(r*r*PI);
		System.out.println(result);
	}

}
