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
			System.out.println(location + "KumhoTire ¼ö¸í : "+ (maxRotation -accumulatedRotation) + "È¸");
			return true;
		}else {
			System.out.println("*** "+ location + " kumhoTire ÆãÅ© ***");
			return false;
		}
	}

}
