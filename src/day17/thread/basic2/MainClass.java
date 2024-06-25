package day17.thread.basic2;

public class MainClass {
	public static void main(String[] args) {
		
		MyThread m1 = new MyThread();
		m1.setName("쓰레드명A");
		m1.start();
		
		MyThread m2 = new MyThread();
		m2.setName("쓰레드명B");
		m2.start();
		
		System.out.println("main쓰레드 종료");
		
	}

}
