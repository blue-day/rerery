package CollectionFramework;

public class Member {
	public String name;
	public int age;
	public Member(String name, int age) {
		super();	// 생성자 자동완성시 들어가는 거지만 신경쓰지 않아도 됨.
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
	

}
