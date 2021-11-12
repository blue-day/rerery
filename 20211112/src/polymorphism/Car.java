package polymorphism;

public class Car {
//	 A	= b
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒷왼쪽", 3);
	Tire backRightTire = new Tire("뒷오른쪽", 4);
	
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if (frontLeftTire.roll()  == false) {stop(); return 1;}	// .roll을 ctrl과 같이 클릭하면 부모메서드로 옮겨짐
		if (frontRightTire.roll() == false) {stop(); return 2;}
		if (backLeftTire.roll()   == false) {stop(); return 3;}
		if (backRightTire.roll()  == false) {stop(); return 4;}
		return 0;
	}
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}

}
