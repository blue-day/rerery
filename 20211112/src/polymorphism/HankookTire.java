package polymorphism;
//				B				  A
public class HankookTire extends Tire {	// Tire = HankookTire
	public HankookTire(String location, int maxRatation) {
		super( location, maxRatation);	
	}
	@Override
	public boolean roll() { // �������̵�
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "HankookTire ���� : "+ (maxRotation -accumulatedRotation) + "ȸ");
			return true;
		}else {
			System.out.println("*** "+ location + " HankookTire ��ũ ***");
			return false;
		}
	}
}
