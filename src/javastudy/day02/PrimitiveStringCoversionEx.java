package javastudy.day02;

/*
 * String => byte String => short String => int String => long String => float
 * String => double String => boolean
 */
public class PrimitiveStringCoversionEx
{

	public static void main(String[] args)
	{
		String str = "10";
		byte value = Byte.parseByte(str);
		System.out.println((str + 10) + " " + (value + 10)); // 1010 20

		String str1 = "200";
		short value1 = Short.parseShort(str1);
		System.out.println((str1 + 10) + " " + (value1 + 10)); // 20010 210

		String str2 = "3000";
		int value2 = Integer.parseInt(str2);
		System.out.println((str2 + 10) + " " + (value2 + 10)); //300010 3010
		
		String str3 = "400000000";
		long value3 = Long.parseLong(str3);
		System.out.println((str3 + 10) + " " + (value3 + 10)); //40000000010 400000010
		
		String str4 = "12.345";
		float value4 = Float.parseFloat(str4);
		System.out.println((str4 + 10) + " " + (value4 + 10)); //12.34510 22.345001
		
		String str5 = "12.345";
		double value5 = Double.parseDouble(str5);
		System.out.println((str5 + 10)+ " " + (value5 + 10)); //12.34510 22.345
		
		String str6 = "true";
		boolean value6 = Boolean.parseBoolean(str6);
		System.out.println((str6 + 10) + " " + (value6)); //true10 true
		
		// 반대로 기본타입의 값을 문자열로 변경하는 경우, String.valueOf( 기본타입값);
		// String str7 = String.valueOf(기본타입값);
		
		String str7 = String.valueOf(value6);
		String str8 = String.valueOf(3.14);
		
		System.out.println(str8 + 10 + "문자열로 변환되었습니다.");
		


	}

}

