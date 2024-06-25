package day13.api.lang.string;

import java.util.Arrays;

public class StringEx01 {
	public static void main(String[] args) {
		String str = "홍길동 입니다~! 안녕하세요?"; // 문자열은 인덱스 번호를 갖는다.
		String str2=new String("홍길동");
		String str3=new String(new char[] {'홍','길','동'});
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);

		//charAt() - 문자열 자르기
		System.out.println(str.charAt(0)); // 인덱스 번호를 받아서 char 타입으로 반환.
		//substring() - 문자열 자르기
		System.out.println(str.substring(5)); // 5 미만은 절삭됨.
		System.out.println(str.substring(5, str.length())); //5~길이 미만 문자열 추출
		//split()
		String[] arr =str.split(" ");
		System.out.println(Arrays.toString(arr));
		//toCharArray()
		char[] arr2 = str.toCharArray();
		System.out.println(Arrays.toString(arr2));
		System.out.println("----------------------------");
		
		//문자열 찾기
		str="아 좋다 좋아";
		System.out.println(str.indexOf("아")); // "아"가 있는 위치
		System.out.println(str.lastIndexOf("아"));// "아"가 뒤에서 발견되는 위치
		System.out.println(str.indexOf("헑"));//없으면 -1 반환.
		
		if(str.indexOf("헑")!=-1) { // 헑이라는 문자가 있다는 조건
		}
		//문자열 길이
		System.out.println(str.length()); //문자열의 길이 반환
		
		//알파벳의 대소문자 변경
		System.out.println(str);
		str="Hello World Happy Day";
		System.out.println(str.toUpperCase()); // 전부 다 대문자로
		System.out.println(str.toLowerCase()); // 전부 다 소문자로
		
		System.out.println("-----------------------------");
		
		//양측 공백 제거
		str = "   abcaaaaa 123    ";
		System.out.println(str.trim()); //양측 공백을 제거.
		//모든 공백 제거 ( 문자열 변경)
		String s = str.replace("a", "헑");//대상문자 , 변경할 문자
		System.out.println(s); //원본 문자에는 반영되지 않는다.
		
		str = str.replace(" ", "");
		System.out.println(str); //원본 문자에 반영됨.
		
		System.out.println("-------------------------------");
		
		//문자열 비교
		if("홍길동".equals("홍길동")) {
			
		}
		
		//문자열 대소비교 - 사전등재순을 기준으로 대소비교를 해준다. (아스키코드 뺄셈)
		System.out.println("홍길동".compareTo("이순신")); 
		// 비교시 양수가 나오면 , 뒤에 문자가 사전적으로 앞에 있다.
		System.out.println("홍길동".compareTo("홍길자")); 
		//동과 자의 아스키 코드 차이 , 음수가 나오면 뒤에 문자가 사전적으로 더 뒤에 있다.
		System.out.println("홍길동".compareTo("홍길동"));
		//0이 나오면 같은 문자
		
		//문자열 합치기
		System.out.println(String.join("->", "서울","대전","대구","부산","찍고"));
		
		//기본 타입을 -> 문자열로 형변환
		System.out.println(String.valueOf(3)+String.valueOf(3));
	}
}


