package javastudy.day02;

public class StringEx1 //문자열(String)
{
	public static void main(String[] args) {
		char var1 = 'A'; //자바스크립트는 문자열시 '도 ' '도 허용했으나... 자바는 엄격히 구분
		
		// 문자열 내부에 역슬래시(\)가 붙은 문자를 사용이 가능(이스케이프 escape 문자)
		// 이스케이프 문자를 사용하면 특정문자를 문자열에 포함시킬 수 있고 출력에 영향을 줄 수 있다.
		
		String name = "김멀티";
		String job = "자바 프로그래머";
		System.out.println(name+"의 직업은 "+job+"입니다.");
		
		String str ="나는\"자바\"를 배웁니다."; //\"는 문자열 언애 ""를 하기 위한 이스케이프 문자
		System.out.println(str);
		
		str = "번호\t이름\t직업"; //\t => tab의 의미
		System.out.println(str);
		
		System.out.print("나는\n");
		System.out.print("나는"); // 커서의 느낌은 다음 print에서 알수 있음 이 문장을 했다면 다음 문장에는 이어서 써질 것
		System.out.print(" 자바를 배웁니다.");
		
		//java 13버전 이상부터 블록문법 제공
		// 큰 따옴표 3개로 감싸서 이스케이프 하거나 라인피드 필요없이 작성한 그대로 문자열 저장
		String str1 ="" + "{\n" + 
		"\t\"id\":\"winter\",\n"
				+ "\t\"name\":\"\"눈송이\"\n"+
		"}";
			System.out.println(str1);
			
			//str1 을 """ """을 이용하면 쉽게 사용 가능
			String str2 ="""
					"id" : "winter",
					"name" : "눈송이"
					""";
					System.out.println(str2);
					
					//java14버전 부터
					// 텍스트 블록에서 줄바꿈은 \n에 해당된다.
					// \ 후 줄바꿈 후 이어지는 문장을 한줄로(줄바꿈하지 않고) 작성 가능 
					String str3 =""" 
							나는 자바를 \
							학습해!
							나는 최고의 자바프로그래머가 될 꺼야!!
							""";
					System.out.println(str3);
	}
	
}
