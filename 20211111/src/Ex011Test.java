
public class Ex011Test {

	public static void main(String[] args) {
		Ex01 ex01 = new Ex01();	// new�� ���� �� ���ο� �ּ� ����
		Ex01 ex02 = ex01; 	// ���� ���� ��ü���� ����
							// ���� �ּҸ� ������.
		
		Ex01 ex03 = new Ex01(); // ���ο� ��ü����
		
		ex01.first = 30;
		System.out.println(ex01.first); // 30
		System.out.println(ex02.first); // 30
		System.out.println(ex03.first); // 0
		if(ex01 == ex02) {
			System.out.println("ex01�� ex02�� ���� ��ü�̴�.");
		}else {
			System.out.println("ex01�� ex02�� �ٸ� ��ü�̴�.");
		}
		if(ex01 == ex03) {
			System.out.println("ex01�� ex03�� ���� ��ü�̴�.");
		}else {
			System.out.println("ex01�� ex03�� �ٸ� ��ü�̴�.");
		}
		/// static Ű���尡 �ִ� ��� ������ ��ü���� ���� Ŭ���������� ����(���)�� �� �ִ�.
		int result = Singleton.val; // private�� �־������� ���������� ������ �ʾ����� ������ ��������
		System.out.println(result);
		// getInstance = 30000�̶�� �ּҸ� ����.
		Singleton s = Singleton.getInstance();	// s = 30000
		Singleton s1 = Singleton.getInstance();	// s1 = 30000
		if (s ==s1) {
			System.out.println("s�� s1�� ���� ��ü�̴�.");
		}else {
			System.out.println("s�� s1�� �ٸ� ��ü�̴�.");
		}

	}

}
