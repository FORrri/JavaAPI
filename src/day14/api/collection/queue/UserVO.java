package day14.api.collection.queue;

public class UserVO implements Comparable <UserVO> {
	
	private String name;
	private int age;
	
	public UserVO() {
		
	}
	
	public UserVO(String name , int age) { // 까먹음
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(UserVO o) {
		//내꺼랑 , 매개변수꺼랑 비교해서 정렬
		
		//이름으로 대소비교
		//return this.name.compareTo(o.getName()); //이름 오름차순 (
		//return o.getName().compareTo(this.name); // 이름 내림차순 (
		
		//나이로 대소비교
		//return Integer.compare(this.age,o.getAge()); // 나이 오름차순
		return Integer.compare(o.getAge(), this.age); // 나이 내림차순
	
	
	
	
	}

	@Override
	public String toString() {
		return "UserVO [name=" + name + ", age=" + age + "]";
	}

}
