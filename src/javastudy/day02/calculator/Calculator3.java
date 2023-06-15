package javastudy.day02.calculator;

import java.lang.System;
import java.util.Scanner;

public class Calculator3
{
	public static void main(String[] args)
	{

		menu();
		System.out.println("해당 연산을 종료합니다.");

	}

	public static void menu()
	{
		// 반복적으로 사용이 가능하며, 끝내기인 0을 누르기 전까지는 계속 반복
		// ()안에는 들어오는 곳을 지정 in : 키보드
		Scanner input = new Scanner(System.in);

		while (true)
		{ // 무한루프이므로 반드시 끝내기 기능이 필수

			// 변수 num1, num2, result
			int num1 = 0, num2 = 0;

			System.out.println();
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1. 더하기");
			System.out.println("2. 빼기");
			System.out.println("3. 곱하기");
			System.out.println("4. 나누기");
			System.out.println("0. 끝내기");

			int num = input.nextInt();

			if (num == 0)
			{
				System.out.println("끝내기를 선택하셨어요. 계산을 종료할게요.");
				break;
			} else
			{
				if (num > 4)
				{
					System.out.println("메뉴 선택을 잘못 선택하셨어요");
					continue; // 다시 돌아감
				}

				System.out.println("첫 번째 숫자를 입력하세요.");
				num1 = input.nextInt();
				System.out.println("두 번째 숫자를 입력하세요.");
				num2 = input.nextInt();

				switch (num)
				{
				case 1:
					plus(num1, num2);
					break;
				case 2:
					minu(num1, num2);
					break;
				case 3:
					multi(num1, num2);
					break;
				case 4:
					div(num1, num2);
					break;
				case 5:
					System.out.println("끝내기를 선택하셨어요");
					input.close();
					break;
				}
			}
		}

	}

	public static void plus(int num1, int num2)
	{
		int result = num1 + num2;
		System.out.printf("%d + %d = %d\n", num1, num2, result);

	}

	public static void minu(int num1, int num2)
	{
		int result = num1 - num2;
		System.out.printf("%d - %d = %d\n", num1, num2, result);

	}

	public static void multi(int num1, int num2)
	{
		int result = num1 * num2;
		System.out.printf("%d * %d = %d\n", num1, num2, result);
	}

// 이름이 바뀌어도 괜찮음
	public static void div(int n1, int n2)
	{
		int result = n1 / n2;
		System.out.printf("%d / %d = %d\n", n1, n2, result);
	}

}
