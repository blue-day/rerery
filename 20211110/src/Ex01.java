
public class Ex01 {
	
// ĸ��ȭ
	// ��� �ʵ�(��� ����)
	int first;
	int second;
	int result;
	
	public Ex01() {} // default ������
	// �ٸ� �����ڰ� ���� ��� byte�ڵ� ���Ͽ� �ڵ����� ����� ������
	// �ٸ� �����ڰ� �ִ� ��� ����Ʈ �����ڸ� ����� �־�� �Ѵ�.
	
	public Ex01(int first) {	// ������ �����ε�
		this.first = first;
		this.second = 10;
	}
	public Ex01(int first, int second) {
		this.first = first;
		this.second = second;
	}
	
	// �޼���
	public void setFirst(int first) {
		this.first = first;
	}
	public int getFirst(int first) {
		return first;
	}
	public int getSecond() {
		return this.second; //return �������� ����ʵ� �տ��� this�� ���̴°� ����.
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	
	public int add() {	// �޼��� �����ε�(�����̸��� �Լ��� �ٸ� ����� ���� ������
		return this.first + this.second;
	}
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	public void add(int num1) {
		System.out.println(num1 + this.first);
	}

}
