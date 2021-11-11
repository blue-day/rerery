package inheritance;

public class Ex09 extends Ex08 {
	// public Ex09() {} - �θ�Ŭ������ �ִ� �����ڿ� ���� ��������� �ϱ� ������ ����Ʈ�����ڸ� ����� �� ����.
	int val;
	public Ex09(int first, int second, int val) { // �ڽ�Ŭ�������� ���� �������ֱ� ���� �����ڰ� �ʼ�
		super(first, second); // �θ������ ȣ��
		this.val = val;
	}
	public void sub() {
		result = first - second;
	}
	public void mul() {
		result = first * second;
	}
	@Override // @ : ������̼�
	// �θ�Ŭ�������� ���� �޼��带 �ڽ�Ŭ�������� ������ �Ѵ�. - ���� �̸��� �޼���� ������ ������ �� ���⿡ �������� �͸� ����.
	public void div() { // public�� ��� �ڽ�Ŭ�������� Ŭ���� ���� �Ұ���. default��� public�� ���� �� �ִ�.
		if (second == 0) {
			result = 0;
		}else {
			result = first / second;
		}
	}
	// �θ� ���� �޼��带 �״�� ����ϰ� �ʹٸ� �̷��� �ڽ�Ŭ�������� �ٽ� �����.
	public void div1() {
		super.div();	// �θ�Ŭ������ �ִ� �޼��带 ȣ���� �������Ѵ�.
	}

}
