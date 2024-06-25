package day17.thread.basic;

public class MainClass {
	public static void main(String[] args) {
		
		
		//runalbe 인터페이스를 상속 받은 경우는 , 쓰레드 객체를 생성해서 동작시킵니다.
		//객체 n개, 쓰레드를 n개로 동작(따로따로)
		
		MyThread m1 = new MyThread();
		MyThread m2 = new MyThread();
		
		Thread thread1 = new Thread(m1,"쓰레드명A");
		Thread thread2 = new Thread(m2, "쓰레드명B");
		thread1.start();
		thread2.start();
		
		
		System.out.println("main쓰레드 정상 종료");
	}
	
	
	
	
	
}
