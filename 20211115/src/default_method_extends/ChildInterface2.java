package default_method_extends;

public interface ChildInterface2 extends ParentInterface{
	@Override	// 상속받은 default 메서드 재정의
	public default void method2() {
		System.out.println("childInterface2-method2");
	}
	public void method3();
	

}
