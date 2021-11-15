package multi_implement;

public interface RemoteControl {
	// 상수
	int MAX_VOLUME = 10;	// 상수는 모두 대문자, 두단어를 합칠 시 _로 구분
	int MIN_VOLUME = 0;
	// 추상 메서드
	void turnOn();
	void turnOff();
	void setVolume(int volume);

}
