package day13.api.lang.wrapper;

public class Boxing {
	
	public static void main(String[] args) {
		//wrapper란 ? > 기본타입의 객체타입을 wrapper 클래스 라고 합니다.
		
		int a = 100;
		double b = 3.14;
		char c = 'A';
		boolean d = false;
		
		//boxing - 기본 타입 -> 객체타입 변환하는 작업
		Integer val1 = new Integer(a);
		Double val2 = new Double(b);
		Character val3 = new Character(c);
		Boolean val4 = new Boolean(d);
		
		System.out.println(val1);
		
		Object[] arr = {val1,val2,val3,val4}; // wrapper는 object의 자식이기 때문에 , 부모에 저장
		
		//unboxing - 객체타입 > 기본타입 변환 작업
		a=val1.intValue();
		b=val2.doubleValue();
		c=val3.charValue();
		d=val4.booleanValue();
		
		System.out.println("----------------------------");
		
		//auto boxing = 자동 형변환
		Integer x = 100; //정수를 wrapper에 저장
		Double y = 3.14; 
		
		int v1=x; //wrapper를 정수에 저장.
		double v2 = y;
		
		//그래서
		Object[] arr2 = {1,2,3.14};
		
		System.out.println("------------------------------");
		//wrapper클래스의 핵심기능 문자열을 >> 기본 타입으로(숫자 etc..) 변환
		int result1 = Integer.parseInt("3");
		double result2 = Double.parseDouble("31.4");
		Long result3 =Long.parseLong("100");
		System.out.println(result1+result2+result3);
		
		
		
		
		
		
		
		
		
		
	
	
	}

}
