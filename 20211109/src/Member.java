
public class Member {
	int age;
	double height;
	String name;
	
	public Member() {}
	public Member(int age, double height, String name) {
		this.age = age;
		this.height = height;
		this.name = name;
	}
	public Member(double height, int age, String name) {// 메서드 오버로딩 /같은정보를 가지고 추가 적용을 위한 식
		this.age = age;
		this.height = height;
		this.name = name;
	}
	public Member(int age) { //메서드 오버로딩
		this.age = age;
	}
	public Member(double height) {
		this.height = height;
	}
	public Member(String name) {
		this.name = name;
	}
	// 메서드
	public void setAge(int age) {//set바로 뒤 단어의 첫글자는 대문자로 적어야 함.
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

}
