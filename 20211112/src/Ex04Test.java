
public class Ex04Test {

	public static void main(String[] args) {
		B b = new B();	// A
		C c = new C();	// A
		D d = new D();	// B, A
		E e = new E();	// C, A
		// ������	* �θ�� �ڽ� ��ü�� ������ �� �ִ�.
		//		* �ڽ��� �θ� ��ӹ޾ƾ����� ���������ϴ�.
		//		* 
		A a = b;	// a�� b�� ��
		a = c;		// a�� c�� ��
		a = d;		// a�� d�� ��
		a = e;		// a�� e�� ��
		a.method0();
		A a1 = new A();
		a1.method0();

	}

}
