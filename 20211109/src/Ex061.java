
public class Ex061 {
	String name;
	int age;
	double height;
	/// �ڹٿ����� �����ڰ� Ŭ������� ���ƾ� �Ѵ�.//�����ڴ� �տ� void�� ���� �ʴ´�.
// ������
// ���������� Ŭ������(Ÿ�� �Ű�����,...)
	public Ex061(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
		System.out.println("������ ����");
	}
	// �޼��� (���̽㿡���� �Լ�) : Ŭ���� ���� �Լ�
	//	���������� ��ȯ�� �Լ���  (�Ű�����)
	// setter
	//		��ȯ��(void : ��ȯ�� �� ���ٶ�� �ǹ�)
	public void setAge(int age) {
		this.age = age;
	}
//	���������� ��ȯ�� �Լ���  (�Ű�����)
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	//getter
	public int getAge() {
	//	  void �ڸ��� int : ������ ��ȯ
		return this.age;
	}
	public double getHeight() {
		return this.height;
	}
	public String getName() {
		return this.name;
	}
}
