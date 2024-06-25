package day13.api.lang.buffer;

public class StringBufferEx {
	
	public static void main(String[] args) {
		
		//빠른 문자열
		//StringBuffer , StringBuilder (builder가 더 빠름)
		
		String str = new String("Java ");
		StringBuffer sb = new StringBuffer("Java ");
		
		//차이점 - 문자열 더할떄
		str=str+"bye~" ; //단점 : str 완전 새로운 변수가 생성됨. 느림. 덮어쓰기
		
		sb.append("bye~"); //마지막에 추가한다 - 기존에 있는 sb 원본 문자가 바뀜.(재활용)
		
		System.out.println(str);
		System.out.println(sb);
		
		//중간에 추가
		sb.insert(5, "hello "); // 5번 위치에 문자열 추가
		System.out.println(sb);
		
		//문자열 변경
		sb.replace(5, 10,"good");
		System.out.println(sb);
		
		//문자열 삭제
		sb.delete(5, 10); //5~10미만 삭제
		System.out.println(sb);
		
		//문자열 로꾸꺼
		sb.reverse();
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		//빠른 문자열을 문자열로 형변환
		
		
		String s = sb.toString(); //문자열로 형변환
		
		if(s.equals("Java bye~")) {
			System.out.println("안똑같을껄?");
		}
		
		
		
		
		
		
		
		
	}

}
