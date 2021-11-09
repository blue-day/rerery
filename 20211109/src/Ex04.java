
public class Ex04 {
	int age;
	double height; // 멤버 필드, 멤버 변수
	boolean gender;
	String name;
	// 한번에 넣을 떄
	public void setData(int age, double height, boolean gender,
			String name) {
		this.age = age;
		this.gender = gender;
		this.height = height;
		this.name = name;
	}
	//따로 하나씩 넣을 때
	public void setAge(int age) {
		this.age = age;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	//getter
	public int getAge() {
		return this.age;
	}
	public double getHeight() {
		return this.height;
	}
	public String getName() {
		return this.name;
	}
	public boolean getGender() {
		return this.gender;
	}

}
