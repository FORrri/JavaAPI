package day14.api.util.date;

import java.util.Calendar;

public class CalendarEx {
	
	public static void main(String[] args) {
		
		
		Calendar cal = Calendar.getInstance(); //이 안에 날짜 , 시간 등이 들어있음
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1; // month는 +1해야 합니다.한달 느리게 나옴
		int day = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(year+"-"+month+"-"+day+" "+hour+":"+minute+":"+second);
	}

}

