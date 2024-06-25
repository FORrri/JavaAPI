package day14.api.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {
	public static <K, V> void main(String[] args) {
		
//		HashMap<Integer,String> map = new HashMap<>();
		Map<Integer,String> map = new HashMap<>();
		
		//값을 추가
		map.put(1, "홍길동");
		map.put(2, "이순신");
		map.put(3, "홍길동");
		map.put(4, "홍길자");
		map.put(5, "신사임당");
		
		System.out.println("맵의크기:"+map.size());
		System.out.println(map.toString());
//		{1=홍길동, 2=이순신, 3=홍길동, 4=홍길자, 5=신사임당} // 엔트리 객체 Entry
		
		//맵에 같은 key를 넣으면?
		//추가하지 않고, key에 해당하는 값을 수정합니다.
		
		map.put(5, "강감찬");
		System.out.println(map.toString());
		
		//값 얻기
		String value = map.get(3); // 키를 매개변수로 주면 , 값을 반환
		System.out.println("3번 키에 해당하는 값은: " + value);
		
		//키의 포함 여부
		if(map.containsKey(3)) { //3번 키가 있다면 true
			System.out.println("3번 키가 존재함");
			
		}
		
		if(map.containsValue("이순신")) {
			System.out.println("이순신 값이 존재함");
		}
		
		//값의 삭제
		
		map.remove(3);//키
		System.out.println(map.toString());
		
		System.out.println("---------------------------");
		//맵의 반복 -> entrySet이용해서 set으로 변경한 다음에 회전
		Set <Entry<Integer,String>> set=map.entrySet();
		
		for(Entry<Integer,String> entry:set) { //entry 안에는 키 , 값을 얻을 수 있는 메서드가 있음
			System.out.println("키 : "+entry.getKey()+" 값 : "+entry.getValue());
			
		}
		
		
	}

}
