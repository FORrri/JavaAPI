package day14.api.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEx {

	public static void main(String[] args) {
		//ArrayDeque<Integer>queue=new ArrayDeque<>();
		Deque<Integer> queue = new ArrayDeque<>();

		//뒤에서 추가
		queue.offer(1);
		queue.offerLast(2);
		queue.offerLast(3);
		queue.offerLast(4);
		
		
		//앞에서 추가
		queue.offerFirst(10);
		queue.offerFirst(20);
		queue.offerFirst(30);
		System.out.println(queue.toString());
		
		
		//뒤에서 삭제
		System.out.println(queue.pollLast());
		System.out.println(queue.pollLast());
		
		//앞에서 삭제
		System.out.println(queue.pollFirst());
		System.out.println(queue.pollFirst());
		
		System.out.println(queue.toString());
		
		//뒤에서 값 확인하기
		System.out.println(queue.peekLast());
		
		//앞에서 값 확인하기
		System.out.println(queue.peekFirst());
		
		//peek는 값반 확인 하기 때문에 큐는 그대로
		System.out.println(queue.toString());

	}



}
