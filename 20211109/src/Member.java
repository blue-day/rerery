
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
	public Member(double height, int age, String name) {// �޼��� �����ε� /���������� ������ �߰� ������ ���� ��
		this.age = age;
		this.height = height;
		this.name = name;
	}
	public Member(int age) { //�޼��� �����ε�
		this.age = age;
	}
	public Member(double height) {
		this.height = height;
	}
	public Member(String name) {
		this.name = name;
	}
	// �޼���
	public void setAge(int age) {//set�ٷ� �� �ܾ��� ù���ڴ� �빮�ڷ� ����� ��.
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
