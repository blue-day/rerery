
public class Ex01Test {

	public static void main(String[] args) {
		Ex01 ex01 = new Ex01();
		Ex01 ex02 = new Ex01();
		Ex01 ex03 = new Ex01();
		if (ex01 == ex02){ // ���� ���� ��ü�� �������� ���� ������ ���� �ٸ� �ּҹ����� ����.
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		// ���� ���� ���ٸ� ���ʿ� ���� �����ϸ� �ٸ� �ʵ� �ڵ����� ���� ���� ���ԵǾ�� �Ѵ�.
		// ������ �׷��� ���� �ʱ� ������ ���� �ٸ���.
		ex01.first = 20;
		System.out.println(ex02.first);// 0
		System.out.println(ex01.first);// 20
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		if(s1 == s2) {
			System.out.println("s1�� s2�� ����.");
		}else {
			System.out.println("s1�� s2�� �ٸ���.");
		}

	}

}
