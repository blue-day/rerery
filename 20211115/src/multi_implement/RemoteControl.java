package multi_implement;

public interface RemoteControl {
	// ���
	int MAX_VOLUME = 10;	// ����� ��� �빮��, �δܾ ��ĥ �� _�� ����
	int MIN_VOLUME = 0;
	// �߻� �޼���
	void turnOn();
	void turnOff();
	void setVolume(int volume);

}
