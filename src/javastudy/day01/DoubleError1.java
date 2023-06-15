package javastudy.day01;

public class DoubleError1
{

	public static void main(String[] args)
	{
		double num1 = 1.0000001;
		System.out.println(num1);
		double num2 = 2.0000001;
		System.out.println(num2);
		double result = num1 + num2;
		System.out.println(result);
		
		double dNum = 0.0;
		for(int i=0; i<1000; i=i+1) {
			dNum = dNum + 0.1;
		}
		System.out.println(dNum);  //실수를 가지고 연산하는 건 컴퓨터가 오차가 생김
		// 실수는 정확한 값이 아니고, 수식에 의해 저장되는 근사치
	}

}
