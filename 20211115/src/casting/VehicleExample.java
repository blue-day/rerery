package casting;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();	// 자동형변환, 부모에 있는 것만 사용가능
		vehicle.run();
		
		Bus bus = (Bus)vehicle;			// 강제형변환, 자식개체에 있는 것이 사용가능해짐
		bus.checkFare();
		bus.run();						// 당연히 부모에 있는 것도 사용가능

	}

}
