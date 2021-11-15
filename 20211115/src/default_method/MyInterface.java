package default_method;

public interface MyInterface {
	public void method1();	// 무조건 재정의를 해야만 하는 메서드
	
	// 오버라이드를 할 수도 있고 안 할 수도 있는 메서드
	public default void method2() {
		System.out.println("MyInterface-method2 실행");
	}
}
