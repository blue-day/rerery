package polymorphism;
//				B				  A
public class HankookTire extends Tire {	// Tire = HankookTire
	public HankookTire(String location, int maxRatation) {
		super( location, maxRatation);	
	}
	@Override
	public boolean roll() { // 오버라이딩
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "HankookTire 수명 : "+ (maxRotation -accumulatedRotation) + "회");
			return true;
		}else {
			System.out.println("*** "+ location + " HankookTire 펑크 ***");
			return false;
		}
	}
}
