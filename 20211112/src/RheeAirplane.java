
public class RheeAirplane extends Airplane{
	static final int NORMAL = 1;		// �Ϲݺ���	: ����� �ֱ� ���� static final�� �տ� ��.
	static final int SUPERSONIC = 2;	// ������ ����			�����̸��� ��� �빮�ڷ� �ϴ� ���� ���ʷ� ��.
	
	int flyMode = NORMAL;
	
	public void fly() {	// �������̵��� ��
		if (flyMode == SUPERSONIC) {
			System.out.println("������ ������ �մϴ�.");
		}else {
			super.fly();
		}
	}

}
