package day14.api.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	public static void main(String[] args) {
		
		//자바에서 기본 큐는 LinkedList로 대신해서 사용합니다.
		Queue <String> queue =new LinkedList<>();
		
		
		//큐의 삽입
		queue.add("홍길동"); //뒤에서 추가
		queue.offer("이순신"); //뒤에서 추가
		queue.offer("홍길자");
		System.out.println(queue.toString());
		
		//큐의 삭제(FIFO)
		String n = queue.poll();
		System.out.println(n); //값을 반환하고 큐에서 삭제
		System.out.println(queue.poll());
		System.out.println(queue.toString());
		
		//큐의 값 확인하기
		String n2 =queue.peek();
		System.out.println(n2 ); //값을 확인만 하고 , 삭제는 하지 않음.
		System.out.println(queue.toString());

	//링크드리스트를 링크리스트 타입에 저장하면 , list기능과 queue기능을 둘 다 쓸 수 있음.
	
	LinkedList <String> list =new LinkedList<>();
	list.add("a");
	list.offer("b");
	list.offer("c");
	list.addFirst("앞에서추가");
	list.addLast("뒤에서추가");
	
	System.out.println(list.toString());
	
	//삭제
	System.out.println(list.poll()); // 앞에서 삭제
	System.out.println(list.remove(0));//0번째 인덱스 삭제
	
	System.out.println(list.toString());
	
	//값 얻기
	System.out.println(list.peek()); //앞에서 얻기
	System.out.println(list.get(0)); //인덱스 번호로 얻기

	//++
	
	
	
	
	
	
	
	
	}	

	
}
