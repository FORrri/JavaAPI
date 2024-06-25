package day16.regex.pattern;

public class RegexEx01 {
	
	public static void main(String[] args) {
		
		String info = "홍길동|20세|서울시 강남구|010-1234-5678";
		
		//전화번호 형식을 찾아서 ***-****-****;
		
		String Pattern="[0-9]{3}-[1-9]{4}-[0-9]{4}";
		
		
//		String pattern = "[0-9]{3}-[0-9]{4}-[0-9]{4}"; //전화번호 패턴
		
		
		//regex라고 적히면 , 정규 표현식이 들어간다는 의미입니다.
		String result=info.replaceAll(Pattern, "***-****-****");
		System.out.println(result);
		
		
	}

}
