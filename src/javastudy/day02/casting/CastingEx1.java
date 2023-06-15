package javastudy.day02.casting;

/*2. 강제 타입 변환 : 큰 허용 범위 타입은 작은 허용 범위 타입으로 자동 타입 변환이 안된다.
 *  타입 캐스팅 연산자 : ()
 * 
 *  작은 허용 범위 타입 = (작은 허용 범위 타입) 큰 허용범위 타입
 *  int => byte
 *  long => int
 *  int => char
 *  실수 => 정수
 */
public class CastingEx1
{

	public static void main(String[] args)
	{
		int var1 = 128;
		byte var2 = (byte) var1;
		//128은 넣을 수 없는 값이라 -128로 출력이 됨 허용 byte의 허용 범위 : -128~127 
		// 허용 범위 외에는 허용 범위 숫자로 바뀜
		System.out.println(var2); 
		
		long var3 = 300;
		int var4 = (int)var3;
		System.out.println(var4);
		
		int var5 =  65;
		char var6 = (char)var5;
		// 문자로 바뀜
		System.out.println(var6);
		
		double var7 = 3.14;
		int var8 = (int)var7; 
		// 소수부는 날라감
		System.out.println(var8);
	}

}

