package day14.api.collection.map;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {
	
	public static void main(String[] args) {
		
		//맵의 특징 + 키의 정렬
		TreeMap<Integer,String>map = new TreeMap<>();
		
		map.put(10,"홍길동");
		map.put(2, "이순신");
		map.put(3, "홍길자");
		map.put(5, "신사임당");
		
		System.out.println(map.toString());
		
		
		//값 얻시
		System.out.println("3번 키에 해당하는 값:" + map.get(3));
		Set<Entry<Integer, String>>set=map.entrySet();
		
		
		for(Entry<Integer, String> entry:set) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		//Map은 다른언어 Python에서는 딕셔너리 , Js에서는 객체라고 부름
		
		
	}

}
