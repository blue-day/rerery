
public interface Ex03 {	
	// ���, �߻�޼��带 �����ִ�
	static final int FIRST = 10;
	
	public void method01();	// �߻�޼���
	// �����ڰ� ����. -> ��ü������ �� �� ���� ����
	// -> �������̵��� �ؼ� ����ϰڴٴ� ��.
	// �Ϲ� �޼��尡 ����. -> �Ϲ� �޼��� : ����ʵ忡 �ִ� ���� �ܺο� �������ְų� ���޹ޱ� ���� ���
	// ����ʵ尡 ����. -> setter, getter�� ����.
	default void method02() {
		System.out.println("default-method");
	}
	static void method03() {
		System.out.println("static-method");
	}
}
