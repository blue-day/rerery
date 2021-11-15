
public interface Ex03 {	
	// 상수, 추상메서드를 갖고있다
	static final int FIRST = 10;
	
	public void method01();	// 추상메서드
	// 생성자가 없다. -> 객체생성을 할 수 없기 때문
	// -> 오버라이딩을 해서 사용하겠다는 것.
	// 일반 메서드가 없다. -> 일반 메서드 : 멤버필드에 있는 값을 외부에 전달해주거나 전달받기 위해 사용
	// 멤버필드가 없다. -> setter, getter가 없다.
	default void method02() {
		System.out.println("default-method");
	}
	static void method03() {
		System.out.println("static-method");
	}
}
