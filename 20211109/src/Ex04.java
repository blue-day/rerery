
public class Ex04 {
	int age;
	double height; // ��� �ʵ�, ��� ����
	boolean gender;
	String name;
	// �ѹ��� ���� ��
	public void setData(int age, double height, boolean gender,
			String name) {
		this.age = age;
		this.gender = gender;
		this.height = height;
		this.name = name;
	}
	//���� �ϳ��� ���� ��
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
