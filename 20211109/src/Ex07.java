
public class Ex07 {// �ڹٿ����� �����ڰ� ��������. /���̽��� �Ѱ���.
	int first;
	int second;
	int result;
	// ���� �������� ���� ������ ���� // ����Ʈ ������.
	public Ex07() { // �����ڰ� �ִ� ��� ����Ʈ �����ڸ� ����ϱ� ���ؼ� ��������� ������־�� �Ѵ�.
		System.out.println("����Ʈ ������ ����");
	} 
	// ����Ʈ ������ : �����ڸ� ������ ������ �ڵ����� ��������� ������
		//				(�⺻���� �����ϴ� ������)-�����ڰ� �����ڸ� ����� ���� ��������� ����
	public Ex07(int first, int second) {
		this.first = first;
		this.second = second;
	}
	// setter
	public void setFirst(int first) {
		this.first = first;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	
	// getter
	public int getFirst() {
		return this.first;
	}
	public int getSecond() {
		return this.second;
	}
	public int getResult() {
		return this.result;
	}
	public void add() {
		this.result = this.first + this.second;
	}
	public void sub() {
		this.result = this.first - this.second;
	}

}
