package day14.api.util.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	
	public static void main(String[] args) {
		//날짜를 나타내는 데이트 객체
		Date date = new Date(); //날짜 객체 만들기
		System.out.println(date); //날짜타입
		
		//날짜를 -> 문자열로 형변환
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss zzz E요일"); 
		String now = sdf.format(date);
		System.out.println(now); // 문자열 타입
		
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd a HH:mm:ss E요일");
		String now2 = sdf2.format(date);
		System.out.println(now2);
		
		
		System.out.println("----------------------------------");
		
		//날짜형식의 문자열 -> 날짜 타입으로 형변환
		
		String str = "2024-05-31 09:44:21";
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date d = sdf3.parse(str);
			System.out.println("변경된 날짜 타입: " + d);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	
		
		
	}

}
