package default_method_extends;

public interface ChildInterface3 extends ParentInterface{
	public void method3();
	@Override
	public void method2();
	// 상속 받은 default 메서드를 꼭 재정의하도록 만듦

}
