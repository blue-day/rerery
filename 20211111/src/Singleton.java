
public class Singleton {
	int first;
	int second;
	//// �̱���
			static 		int 	val 	   = 	10;
	private static Singleton singleton = new Singleton();	// 30000 �̶�� ����
	
	private Singleton() {}
	public static Singleton getInstance() {	// �ڽ��� ��ü�� ���� // �޼����� �̸��� �߿����� ����.
		return singleton;
	}
	////
	public int getFirst() {
		return first;
	}
	public void setFirst(int first) {
		this.first = first;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
}

