package runtime_exception;

public class ThrowsExample {

	public static void main(String[] args) {
		try {
		test();	// ȣ���Լ�
		}catch(ArithmeticException e) {
			System.out.println(0);
		}

	}
	// ȣ���Լ� ������ ����ó���� �Ϸ��� throws�����ڸ� �̿� �ڿ� �����κб��� ������� �Ѵ�.
	public static void test() throws ArithmeticException {
		int i = 2;
		int j = 0;
//		try {	<- �Ϲ��� ����ó��
			System.out.println(i / j);
//		}catch(ArithmeticException e) {
//			System.out.println(0);
	}
}


/*	at runtime_exception.ThrowsExample.test(ThrowsExample.java:12)
	at runtime_exception.ThrowsExample.main(ThrowsExample.java:6)
	: �Ʒ�(6)�� �����ߴ��� ��(12)���� ������ ����. 
*/