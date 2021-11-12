
public class RheeAirplane extends Airplane{
	static final int NORMAL = 1;		// 일반비행	: 상수로 주기 위해 static final을 앞에 줌.
	static final int SUPERSONIC = 2;	// 초음속 비행			변수이름은 모두 대문자로 하는 것을 관례로 함.
	
	int flyMode = NORMAL;
	
	public void fly() {	// 오버라이딩이 됨
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속 비행을 합니다.");
		}else {
			super.fly();
		}
	}

}
