
public class Ex06 {// args ����

	public static void main(String[] args) {
		int result;
		if(args[0].equals("/?")) {
			System.out.println("���� ���");
		}else if(args[0].equals("+")) {
			result = Integer.parseInt(args[1])
					+ Integer.parseInt(args[2]);
			System.out.println(result);
		}else if(args[0].equals("-")) {
			result = Integer.parseInt(args[1])
					- Integer.parseInt(args[2]);
			System.out.println(result);
		}
		// String[] args = {"+", "10", "20"}
		String [] str = {"�̼���", "�̻��", "�����"};
		System.out.println(str[0]);
	}
}
