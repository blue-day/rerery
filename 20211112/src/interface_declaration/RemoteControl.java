package interface_declaration;
// class가 아닌 interface를 앞에 적어준다.
public interface RemoteControl {
	// 생성자 X, 필드X, 일반 메서드X, 객체생성할 수 없다.
	// 상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	/// 자바 8버전부터
	// 디폴트 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리를 합니다.");
		}else {
			System.out.println("무음 해제를 합니다.");
		}
	}
	// 정적 메소드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}

}
