
public class RheeAirplaneTest {
////// 중요! ctrl + shift + f : 자동 들여쓰기 - 에러있을 시 되지않음
	public static void main(String[] args) {
		RheeAirplane ex = new RheeAirplane();
		ex.fly();
		ex.flyMode = RheeAirplane.SUPERSONIC; // static이 있을 경우 클래스명을 사용
		ex.fly();
		ex.flyMode = RheeAirplane.NORMAL;
		ex.fly();

	}

}
