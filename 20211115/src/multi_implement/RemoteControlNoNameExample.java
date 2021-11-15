package multi_implement;

public class RemoteControlNoNameExample {
	// �͸� ���� : ��ӵ� Ŭ�������� ���� ä�� ��� (Ŭ��������� ���� �ʰ� ���)
	public static void main(String []args) {
		// �������̽��� �̿��ؼ� ��ü�����ÿ� �������ϴ� ��
		RemoteControl rc = new RemoteControl() {
			int volume;
			@Override
			public void turnOn() {
				System.out.println("TV�� �մϴ�.");
			}
			@Override
			public void turnOff() {
				System.out.println("TV�� ���ϴ�.");
			}
			@Override
			public void setVolume(int volume) {
				if(volume > RemoteControl.MAX_VOLUME) {	// ����� Ŭ������. �����
					this.volume = RemoteControl.MAX_VOLUME;
				}else if(volume < RemoteControl.MIN_VOLUME) {
					this.volume = RemoteControl.MIN_VOLUME;
				}else {
					this.volume = volume;
				}
				System.out.println("���� TV ���� : " + this.volume);
			}

		};
		rc.turnOn();
		rc.turnOff();
	}
}
