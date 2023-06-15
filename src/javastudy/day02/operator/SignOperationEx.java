package javastudy.day02.operator;

public class SignOperationEx
{
	public static void main(String[] args) {
		// 1. 부호 연산자 : 부호를 바꾸는 것들
		byte b = 100;
		int result = -b; //기억 : 정수타입(byte, short, int) 연산의 결과는 int 타입이다.
		System.out.println(result + 1);
		
		int x = 100;
		x = -x;
		System.out.println(x);
		
		byte b1 = 100;
		int y = -b1;
		System.out.println(y);
		
		// 2. 증감 ++/감소 --
		int x1 = 10;
		int y1 = 10;
		int z;
		
		x1++; // x=x+1;    11
		++x1;// x=x+1;      12
		System.out.println(x1); //12
		System.out.println("----------------------");
		
		y1--; //y = y-1 9
		--y1; // y = y-1 8
		System.out.println(y1); //8
		System.out.println("----------------------");
		
		// prefix (선증가)
		// postfix 후치 증가 다른연산자와 계산될 때 변수에 앞/뒤 실행순서가 달라진다.
		z = ++x1; //다른연산자에 결합시 연산의 우선순위에 의해 달라짐  
		System.out.println("z= " + z); //12
		System.out.println("x1= " + x1); //13
		System.out.println("----------------------");
		
		// 지금 z에 집어 넣기 위해서는 
		// 1, 더하기를 먼저 해야해.. x1의 값은 선증가라 14가 돼 2. y1 후치증가 증가 안하고 8인 채로
		// 2. z 계산후 3. y1는 9로 증가
		z = ++x1 + y1++; //x1 = 14 + y1 = 8 한 후 y1을 후치 증가
		
		System.out.println(z); //22
		System.out.println(x1); // 14
		System.out.println(y1); //9
		
		int x2 = 10;
		int y2 = 20;
		int z2 = (++x2) + (y2--); 
		//x2 : 11, y2 : 19, z2 : 11 + 20 = 31
		
		 z2 = (++x1) +(y1--); 
		 //z2: 15+9 = 24, x1:15 y1:8
	}
	
}
