package javastudy.day02.casting;

/*
 * 1. 자동 타입 변환 : 자동으로 타입 변환이 일어난다. 값의 허용범위가 작은 타입이 허용범위가 큰타입으로 내입될 때 발생한다. -
 * - 기본타입의 허용범위 순서 : byte < short , char < int < long <float <double
 * - 예) byte byteValue = 10;
 *         int intValue = byteValue;
 * //자동타입 변환, 작은게 큰거 안으로 들어가기 때문이다.
 * 
 */
public class CastingEx
{

	public static void main(String[] args)
	{
		long longValue = 50000000000L;
		float floatValue = longValue; //long이 float보다 작기 때문에 자동 형변환 가능
		double doubleValue = longValue; //long이 double보다 작기 때문에 자동 형변환 가능
		
		System.out.println(longValue+" "+ floatValue + " " + doubleValue);
		
		char charValue = 'A';
		int exchar = charValue;
		System.out.println(exchar);
		
		byte byteValue = 65;
		/*
		 * char charValue1 = byteValue; 
		 * - 자동타입에서 예외상황 : char는 허용범위는 음수를 포함하지 않고,  byte타입은 음수를 포함하기 때문이다.
		 */
	}

}

