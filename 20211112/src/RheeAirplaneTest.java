
public class RheeAirplaneTest {
////// �߿�! ctrl + shift + f : �ڵ� �鿩���� - �������� �� ��������
	public static void main(String[] args) {
		RheeAirplane ex = new RheeAirplane();
		ex.fly();
		ex.flyMode = RheeAirplane.SUPERSONIC; // static�� ���� ��� Ŭ�������� ���
		ex.fly();
		ex.flyMode = RheeAirplane.NORMAL;
		ex.fly();

	}

}
