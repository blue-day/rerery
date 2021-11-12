package interface_declaration;

public class RemoteControlNoNameExample {
	
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			int vol;
			@Override
			public void turnOn() {
				System.out.println("cd를 on합니다.");
			}
			@Override
			public void turnOff() {
				System.out.println("cd를 off합니다.");	
			}
			@Override
			public void setVolume(int volume) {
				if(volume > RemoteControl.MAX_VOLUME) {
					vol = RemoteControl.MAX_VOLUME;
				}else if(volume < RemoteControl.MIN_VOLUME) {
					vol = RemoteControl.MIN_VOLUME;
				}else {
					vol = volume;
				}
				System.out.println(" 현재 cd의 볼륨은 "+ vol + "입니다.");
				
			}
		};
		rc.turnOn();
		rc.turnOff();
	}

}
