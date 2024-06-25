package day16.ramda.basic;

public class MainClass {

	public static void main(String[] args) {

		Person p = new Person();

		Say01 say = (()-> {
			// TODO Auto-generated method stub
			System.out.println("안녕?");
		});

		
		
		p.greeting(()->{
			System.out.println("안녕?");
		});
		
//		p.greeting(new Say02() {
//
//			@Override
//			public String talking(String word) {//그의 인사법
//				// TODO Auto-generated method stub
//				return word+":hello?";
//			}
//			
//		});
		
		p.greeting((String word) ->{
			return word + "hello?";
		});
		
		//1.매개변수의 타입은 생략할 수 있음.
		//2.매개변수가 1개라면 ()도 생략 가능.
		//3. 실행구문이 1줄이라면 , {}를 생략 가능.
		//4. 한줄구문으로 적었을때 return이 생략됨
		p.greeting(word -> word + " : bye?");
		
		
		//calculating 메서드를 람다식으로 호출시키는데
		//기능 - int의 개수만큼 int 10*word 문자열 합을 구해서 반환.
		
		p.calculating(( int i, String word ) -> {
			String re="";
			for(int j=0; j<i; j++) {	
				re+=word;
			}
			return re;
		});
		
	}
}





//
////			@Override
////			public void talking() {
////				// TODO Auto-generated method stub
////				
////			}
////			
////		};
//		}

		









