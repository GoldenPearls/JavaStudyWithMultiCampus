package javastudy.day02.operator;

/*오버플로우/언더 플로우
- 오버 플로우란? 타입이 허용하는 최댓값을 벗어나는 것
- 언더플로우란? 타입이 허용하는 최솟값을 벗어나는 것
정수타입 연산 오버플로우나 언더플로우가 발생하면 에러가 발생하지 않고, 해당 정수 타입의 최댓값, 최솟값으로 변환
*/
public class OverflowUnderflowEx
{

	public static void main(String[] args)
	{
		//오버플로우 : 최대값을 벗어나 작은 허용범위 숫자로 변경
		byte var1 = 125;
		for(int i = 0; i<5; i++) {
			var1++;
			System.out.println("var1 : "+var1); // 126, 127, -128, -127 -126
			
		}
		
		System.out.println("-------------------");
		
		//언더플로우 : 최소값을 벗어나 높은 허용범위 숫자로 변경
		byte var2 = -125;
		for(int i = 0; i<5; i++) {
			var2--;
			System.out.println("var2 : " + var2); //-126, -127, -128, 127, 126
		}
		
		//허용범위가 넘어가게 됨
		int var3 = 1000000;
		int var4 = 1000000;
		int var5 = var3 * var4;
		System.out.println(var5); //-727379968
		}

	}

