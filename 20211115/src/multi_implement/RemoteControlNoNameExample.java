package multi_implement;

public class RemoteControlNoNameExample {
	// 익명 구현 : 상속된 클래스명이 없는 채로 사용 (클래스상속을 하지 않고 사용)
	public static void main(String []args) {
		// 인터페이스를 이용해서 객체생성시에 재정의하는 것
		RemoteControl rc = new RemoteControl() {
			int volume;
			@Override
			public void turnOn() {
				System.out.println("TV를 켭니다.");
			}
			@Override
			public void turnOff() {
				System.out.println("TV를 끕니다.");
			}
			@Override
			public void setVolume(int volume) {
				if(volume > RemoteControl.MAX_VOLUME) {	// 상수는 클래스명. 상수명
					this.volume = RemoteControl.MAX_VOLUME;
				}else if(volume < RemoteControl.MIN_VOLUME) {
					this.volume = RemoteControl.MIN_VOLUME;
				}else {
					this.volume = volume;
				}
				System.out.println("현재 TV 볼륨 : " + this.volume);
			}

		};
		rc.turnOn();
		rc.turnOff();
	}
}
