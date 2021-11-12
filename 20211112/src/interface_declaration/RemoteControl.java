package interface_declaration;
// class�� �ƴ� interface�� �տ� �����ش�.
public interface RemoteControl {
	// ������ X, �ʵ�X, �Ϲ� �޼���X, ��ü������ �� ����.
	// ���
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// �߻� �޼ҵ�
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	/// �ڹ� 8��������
	// ����Ʈ �޼ҵ�
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���� �մϴ�.");
		}else {
			System.out.println("���� ������ �մϴ�.");
		}
	}
	// ���� �޼ҵ�
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}

}
