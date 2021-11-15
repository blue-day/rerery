package interface_instanceof;

public class Driver {
	// instanceof�� Ŭ������ ��ü�� ������ ���Ҷ� ���
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {	// instanceof : ��ü�񱳽� ���
			// vehicle ��ü�� BusŬ������ ������� ��ü���� ���� ��
			// instanceof�� ������� booleanŸ���̴�.
			Bus bus = (Bus)vehicle;	// ��������ȯ
			bus.checkFace();		// �ڽ�Ŭ���� ���
		}
		vehicle.run();
	}

}
