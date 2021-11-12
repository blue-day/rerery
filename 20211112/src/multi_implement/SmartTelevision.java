package multi_implement;

import interface_declaration.RemoteControl;

// 클래스간에는 다중상속이 되지 않음
// 클래스와 인터페이스간에는 다중 상속이 가능
public class SmartTelevision implements RemoteControl, Searchable {	// interface 상속은 implements(다중 s) : 다중 상속
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("전원을 켭니다.");	
	}
	@Override
	public void turnOff() {
		System.out.println("전원을 끕니다.");	
	}
	@Override
	public void setVolume(int volume) {
		// 정의할 게 없는데 불러왔다면 그냥 {}로 두면 된다.
	}
	@Override
	public void search(String url) {
		System.out.println("  ");
		
	}

}
