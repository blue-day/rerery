package polymorphism;
//				B				A
public class KumhoTire extends Tire {	// Tire = KumhoTire
	public KumhoTire(String location, int maxRatation) {
		super( location, maxRatation);	
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "KumhoTire ���� : "+ (maxRotation -accumulatedRotation) + "ȸ");
			return true;
		}else {
			System.out.println("*** "+ location + " kumhoTire ��ũ ***");
			return false;
		}
	}

}
