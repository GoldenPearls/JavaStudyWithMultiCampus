package javastudy.day02.operator;

public class AccuracyEx
{

	public static void main(String[] args)
	{
		// result를 아예 실수형으로 쓰지말고 result/10.0 이런식으로 사용
		int apple = 1;
		int totalPieces = apple * 10;
		int number = 7;
		
		// 10조각에서 남은 조각수 => 3
		// 사과 1개에서 남은 양 => 0.3
		
		int result = totalPieces - number;
		
		System.out.println(result); //3
		System.out.println(result/10.0); //0.3

	}

}
