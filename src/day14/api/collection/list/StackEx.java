package day14.api.collection.list;

import java.util.Stack;

public class StackEx {
	
	public static void main(String[] args) {
		
		//모든 컬렉션은 동적인 크기를 가집니다.
		Stack<Integer> stack = new Stack<>();
		
		//스택에 값을 추가
		stack.push(1);
		stack.push(2);
		stack.push(3); //마지막에 들어감
		
		//pop():스택에 값을 삭제(하면서 값 return)
		int a = stack.pop();
		System.out.println(a);
		
		//스택의 들어있는 값을 문자열로 확인
		System.out.println(stack.toString());
		
		
		//스택의 크기
		System.out.println("스택의 크기 : "+stack.size());
		
		//스택에서 값을 얻음 . peek(): 값을 끄집어 내는것이지 삭제시키지 않는다.
		int b = stack.peek();
		System.out.println(b); 
		System.out.println(stack.toString());
		
		//스택이 비어있는지 확인
		System.out.println(stack.isEmpty()); //스택이 비었다면 true , 아니면 false
		
		
	}

}
