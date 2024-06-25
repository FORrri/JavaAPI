package day14.generic.basic;

public class MainClass {
	
	public static void main(String[] args) {
		
		//ABC abc = new ABC(); // 무엇이든 저장가능한 상자.
		
		//문자열을 저장하는 상자
		ABC<String> abc = new ABC<String>();
		abc.setT("홍길동");
		String name = abc.getT();
		
		//Person 저장하는 상자
		ABC<Person> abc2 = new ABC<>(); // 뒤에 <> 타입은 생략 가능 ex : <>
		abc2.setT(new Person());
		Person p = abc2.getT();
		
		//<>는 '객체' 타입만 사용가능
		ABC<Integer> abc3 = new ABC<>(); //wrapper 타입 숫자 int는 안돼
		
		//멀티제네릭 객체 생성
		
		DEF<Integer, String> def =new DEF<>(); 
		def.put(1, "홍길동"); // 1번 홍길동
		String n = def.get(1); // 1번 줘 ~ 값을 받음 
	}

}
