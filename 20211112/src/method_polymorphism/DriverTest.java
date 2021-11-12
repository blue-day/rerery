package method_polymorphism;

public class DriverTest {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
//		Vehicle vehicle = new Vehicle(); -> 추상클래스로 했기 때문에 객체생성이 안됨.
		driver.drive(bus);
		driver.drive(taxi);	// 매개변수의 다형성
		

	}

}
