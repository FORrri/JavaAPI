package day14.api.util.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class LocalDateEx {
	
	public static void main(String[] args) {
		
		/*
		 * LocalDate - 년 월 일
		 * LocalTime - 시 분 초
		 * LocalDateTime - 년 월 일 시 분 초 (밀리세컨까지)
		 * 
		 */
		
		LocalDate date = LocalDate.now();
		System.out.println(date); //
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime); // 
		
		System.out.println("--------------------------------");
		
		//LocalDateTime -> String 형변환
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
		String now =dtf.format(datetime);
		
		System.out.println(now);
		
		System.out.println("--------------------------------");
		
		//string > localDateTime형 변환
		
		LocalDateTime nowdate =LocalDateTime.parse(now,DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")); //문자,문자에 대한 포맷 형식
		
		
		
		
		
	}

}
