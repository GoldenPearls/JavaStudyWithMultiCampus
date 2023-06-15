package javastudy.day02.operator;

/*나눗셈 또는 % 5/0 5%0
 * 0으로 나누지 못함 컴파일 해주지 않음
 * */
public class ArithmeticNaN_Infinity_Ex
{
	public static void main(String[] args) {
		/*
		 * int x = 5; 
		 * int y = 0;
		 *  int result = 5/0; 
		 *  System.out.println(result); //에러 
		 */
		
		/*
		 * int x = 5; double y = 0.0; double result = x/y; //나누기 Infinity(무한대) 결과
		 * System.out.println(result);
		 * 
		 * int x = 5; double y = 0.0; double result = x%y; //NaN => 더 이상 나아갈 수 없음 절대 나오게
		 * 하면 안됨 System.out.println(result);
		 */
		
		//▪ Infinity 또는 NaN 상태에서 계속해서 연산을 수행하면 안 됨
		
		int x = 5; 
		double y = 0.0; 
		double result = x/y;
		
		/*
		 * 나눗셈을 할 때 꼭 Double.isInfinite()와 Double.isNaN()를 사용해 /와 % 연산의 결과가 Infinity 또는
		 * NaN인지 먼저확인하고 다음 연산을 수행하는 것이 좋음
		 */		
		/*
		 * if(Double.isInfinite(result||Double.isNaN(result))) {
		 * System.out.println("값 산술 불가"); } else { System.out.println(result + 2); }
		 */
		
		
	}
}
