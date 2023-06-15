package javastudy.day02;

public class VariableScopeEx1
{
	public static void main(String[] args) {
		//코드 블럭이 어디까지인지를 자세히 알 것!
			int v1 = 15;
			int v2 = 0;
			if(v1>10) {
				v2 = v1 - 10;
			}
			int v3 = v1 + v2 + 5;
	}
}
