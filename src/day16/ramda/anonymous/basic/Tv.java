package day16.ramda.anonymous.basic;

public class Tv {
	
	
	//
	private int volume;
	public RemoteControl remote;
	
	//생성될때 , 리모컨 객체를 갖는다 (익명객체)
	
	public Tv() {
		remote = new RemoteControl() {
			
			
			//안에서 바깥을 참조할 수 있음
			@Override
			public void volumeUp() {
				// TODO Auto-generated method stub
				volume++;
			}
			
			@Override
			public void volumeDown() {
				// TODO Auto-generated method stub
				volume--;
			}
			
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("TV켭니다");
			}
			
			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("TV끕니다");
			}
		}; {
			
			
}
	}
}
