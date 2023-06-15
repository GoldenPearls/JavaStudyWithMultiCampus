package javastudy.day02;

public class StringEx2 //문자열(String)
{
	public static void main(String[] args) {
		//숫자연산
		int result1 = 10 + 2 + 8;
		System.out.println(result1);
		
		// 결합연산 문자열 + 숫자 = 문자열
		String result2 = 10+ 2+ "8"; //128
		String result3 = 10+ "2"+ 8; //1028
		String result4 = "10"+ 2+ 8;//1028
		String result5 = "10"+ (2+ 8);//1010
		
	}
	
}
