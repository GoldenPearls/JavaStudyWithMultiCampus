package javastudy.day01;

import java.util.Scanner; //입력 가능하게 만들어주는 것

public class FinalUse
{

	public static void main(String[] args)
	{
		final int MAX_NUM = 100;
		final int MIN_NUM;
		MIN_NUM=60;
		
	
		Scanner input = new Scanner(System.in); //입력을 받기 위한
		System.out.println("학생 점수 입력:");
		int myScore = input.nextInt(); //정수로 받음
		
		if(myScore < MIN_NUM) {
			System.out.println("넌 F야!");
		}
		else {
			System.out.println("통과!");
		}
	}

}
