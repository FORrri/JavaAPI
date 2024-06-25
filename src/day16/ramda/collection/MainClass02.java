package day16.ramda.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainClass02 {
	
	public static void main(String[] args) {
		
		List<Integer>list = new ArrayList<>();
		for(int i=1 ; i<=100; i++) {
			list.add(new Random().nextInt(100)+1);
		}
		System.out.println("원본: "+list.toString());
		
		
		System.out.println("---------------------------------------------");
		
		//중간처리메서드 -> 반환이 다시 Stream.
		//distinct() - 중복제거.
		list.stream().distinct().distinct().forEach(a->System.out.print(a+" "));
		System.out.println();
		//컬렉트 -> 다시 컬렉션으로 반환.
		List <Integer> newList=list.stream().distinct().collect(Collectors.toList());
		System.out.println(newList.toString());
		
		//filter - 걸러내기(리턴에 true인 값만 필터링)
		list.stream().filter(t -> t%2==0).forEach(t->System.out.print(t+" "));
		
		//sorted - 정렬
		list.stream()
		    .filter(t->t%2==0)
		    .sorted()
		    .forEach(t->System.out.print(t+" "));
		
		System.out.println();
		//map - 리턴에 담긴 값으로 새로운 Stream을 생성 
		List<String>list2=list.stream().map(a-> a%2==0? "짝":"홀").collect(Collectors.toList());
		System.out.println(list2.toString());
		
	
		System.out.println("---------------------------------------------");
		/*
		 * 원본 list를 가지고
		 * 중복은 제거하고 , 65보다 큰 수들만 , 
		 * 정렬해서 , 이 값들을 아스키코드 문자로 변환해서 리스트로 생성
		 */
		
		List<Character>list3=list.stream().distinct().filter(t -> t>=65).sorted().map(a -> (char)a.intValue()).collect(Collectors.toList());
		System.out.println(list3.toString());
		//distinct() 중복제거 , map(괄호에 담긴 값으로 새로운 stream 생성
		
	
	}

}
