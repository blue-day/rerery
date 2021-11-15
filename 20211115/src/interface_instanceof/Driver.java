package interface_instanceof;

public class Driver {
	// instanceof는 클래스와 객체가 같은지 비교할때 사용
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {	// instanceof : 객체비교시 사용
			// vehicle 객체가 Bus클래스로 만들어진 객체인지 묻는 것
			// instanceof의 결과값은 boolean타입이다.
			Bus bus = (Bus)vehicle;	// 강제형변환
			bus.checkFace();		// 자식클래스 사용
		}
		vehicle.run();
	}

}
