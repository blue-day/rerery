package default_method;

public interface MyInterface {
	public void method1();	// ������ �����Ǹ� �ؾ߸� �ϴ� �޼���
	
	// �������̵带 �� ���� �ְ� �� �� ���� �ִ� �޼���
	public default void method2() {
		System.out.println("MyInterface-method2 ����");
	}
}
