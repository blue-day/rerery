package polymorphism;

public class Tire {
	
	public int maxRotation;
	public int accumulatedRotation;	// 누적 회전수
	public String location;
	
	public Tire(String location, int maxRatation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	// 타이어가 굴러가는 메서드
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire 수명 : "+ (maxRotation -accumulatedRotation) + "회");
			return true;
		}else {
			System.out.println("*** "+ location + " Tire 펑크 ***");
			return false;
		}
	}

}
