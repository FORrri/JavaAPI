package day14.generic.basic;

public class DEF<T,C> { // 멀티제네릭 - 타입을 두개 이상 설정 가능.

	//t = 금고 키 , C = 금고 안 값
	
	private T key;
	private C value;
	
	public void put(T key , C value) {
		this.key = key;
		this.value = value;
	}
	
	public C get(T key) {
		return value;
	}
	
	
}
