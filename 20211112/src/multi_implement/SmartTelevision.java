package multi_implement;

import interface_declaration.RemoteControl;

// Ŭ���������� ���߻���� ���� ����
// Ŭ������ �������̽������� ���� ����� ����
public class SmartTelevision implements RemoteControl, Searchable {	// interface ����� implements(���� s) : ���� ���
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("������ �մϴ�.");	
	}
	@Override
	public void turnOff() {
		System.out.println("������ ���ϴ�.");	
	}
	@Override
	public void setVolume(int volume) {
		// ������ �� ���µ� �ҷ��Դٸ� �׳� {}�� �θ� �ȴ�.
	}
	@Override
	public void search(String url) {
		System.out.println("  ");
		
	}

}
