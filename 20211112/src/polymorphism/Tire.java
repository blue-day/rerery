package polymorphism;

public class Tire {
	
	public int maxRotation;
	public int accumulatedRotation;	// ���� ȸ����
	public String location;
	
	public Tire(String location, int maxRatation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	// Ÿ�̾ �������� �޼���
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire ���� : "+ (maxRotation -accumulatedRotation) + "ȸ");
			return true;
		}else {
			System.out.println("*** "+ location + " Tire ��ũ ***");
			return false;
		}
	}

}
