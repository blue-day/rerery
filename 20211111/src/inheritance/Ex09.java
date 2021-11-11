package inheritance;

public class Ex09 extends Ex08 {
	// public Ex09() {} - 부모클래스에 있는 생성자에 값을 전달해줘야 하기 때문에 디펄트생성자를 사용할 수 없음.
	int val;
	public Ex09(int first, int second, int val) { // 자식클래스에서 값을 전달해주기 위한 생성자가 필수
		super(first, second); // 부모생성자 호출
		this.val = val;
	}
	public void sub() {
		result = first - second;
	}
	public void mul() {
		result = first * second;
	}
	@Override // @ : 어노테이션
	// 부모클래스에서 가진 메서드를 자식클래스에서 재정의 한다. - 같은 이름의 메서드는 여러개 존재할 수 없기에 재정의한 것만 남음.
	public void div() { // public일 경우 자식클래스에서 클래스 수정 불가능. default라면 public을 붙일 수 있다.
		if (second == 0) {
			result = 0;
		}else {
			result = first / second;
		}
	}
	// 부모가 가진 메서드를 그대로 사용하고 싶다면 이렇게 자식클래스에서 다시 적어라.
	public void div1() {
		super.div();	// 부모클래스에 있는 메서드를 호출해 재정의한다.
	}

}
