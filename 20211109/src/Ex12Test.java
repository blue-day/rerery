
public class Ex12Test {

	public static void main(String[] args) {
		Ex12 ex12 = new Ex12();
		ex12.setFirst(20);		// public �޼��� ����
		ex12.setSecond(10);
		int result = ex12.add();//ex12.add() : ȣ�� �޼���
		System.out.println(result);
		result = ex12.sub();
		System.out.println(result);
		String name = ex12.getName();
		System.out.println(name);
		
		
	}

}
