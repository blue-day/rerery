package casting;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();	// �ڵ�����ȯ, �θ� �ִ� �͸� ��밡��
		vehicle.run();
		
		Bus bus = (Bus)vehicle;			// ��������ȯ, �ڽİ�ü�� �ִ� ���� ��밡������
		bus.checkFare();
		bus.run();						// �翬�� �θ� �ִ� �͵� ��밡��

	}

}
