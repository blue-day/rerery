
public class Ex14 {//�޼���(�Լ�)�� 4���� ����
	int result;// ����ʵ�
	int first;
	int second;
	int add; //add : ����
	public Ex14(int first, int second) {
		this.first = first; 	// ����ʵ�� �Ű������� �����ϱ� ���� this�� �ٿ� ����.(this. )
		this.second = second;	// ���� �̸��� �ٸ��ٸ� ���� ���� �ʿ� ������ ���� �� ���Ǽ��� ���� �̸��� ���� ����
	}
	////// �޼����� 4���� ����(�Լ�)
	// 1. �Է°��� �ְ�(�Ű������� �ְ�) ������� �ִ�(��ȯ���� �ִ�) �޼���
	public int add(int num1, int num2) { // add() : �Լ� / ���� �̸��� ������ �Լ��� ������ �� �ִ�.
		return num1 + num2;
	}//																�̸��� ������ ��� ����
	// �޼��� �����ε� : ���� �̸��� �Լ��� ���������� �Ű������� �ٸ� - �ż����� ����(Ÿ���� ����),����,Ÿ�� �� �Ѱ��� �޶�� ��
	//			** ��ȯ���� �ٸ����� ������� �����ɷ� ����Ǳ� ������ ��ȯ���� �ٸ� ���� �Լ��� ������ ����
	public int div(int num1, int num2) {
		return num1 / num2;
	}
	// 2. �Է°�(�Ű�����)�� �ְ� �����(��ȯ��)�� ���� �޼���
	public void sub(double num1, int num2){ // ��ȯ���� �����Ƿ� void ���
		this.result = (int)num1 - num2;	// ���⼭�� this. �� ���� �ʿ� ������ ���Ǽ�(����)�� ���� �ٿ��� ���
		System.out.println(this.result);
	}
		// �޼��� �����ε� // �Ű������� ������ �ٸ�
	public int sub(int num1, double num2) {
		return num1 - (int)num2;
	}
	// 3. �Է°�(�Ű�����)�� ���� �����(��ȯ��)�� �ִ� �޼���
	public int mul() {
		return this.first * this.second;
	}
	// 4. �Է°�(�Ű�����)�� ���� �����(��ȯ��)�� ���� �޼���
	public void div() {
		System.out.println(this.first / this.second);
	}
}
