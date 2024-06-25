package day13.api.util.arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArraysEx {
	
	public static void main(String[] args) {
		
		//배열관련 클래스 Arrays
		int [] arr = {3,4,5,1,2,6,7,9,10};
		int ind = Arrays.binarySearch(arr, 4);
		System.out.println(ind+"가 음수이면 잘못된 값입니다. 정렬을 안하고 binarysearch 불가");
		//배열 정렬
		Arrays.sort(arr);
//		Arrays.sort(arr, Collections.reverseOrder());

		//문자열로 출력
		System.out.println(Arrays.toString(arr));
		
		//요소 검색 binarysearch (선행 조건 - 정렬)
		int index = Arrays.binarySearch(arr, 3) ; //배열 , 찾을 값
		System.out.println("3이 있는 위치 "+index); // 인덱스값
		
		//배열 복사
		int [] newArr=Arrays.copyOf(arr,arr.length *2 ); //배열 , 복사할 길이
		System.out.println(Arrays.toString(newArr));
		
		int [] newArr2=Arrays.copyOfRange(arr, 3, 5);
		System.out.println(Arrays.toString(newArr2));
		
		//배열 비교 equals
		if(Arrays.equals(newArr, newArr2)) {
			System.out.println("배열요소가 같음");
			
		}else {
			System.out.println("배열요소가 다름");
		}

	}

}
