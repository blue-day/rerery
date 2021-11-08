
public class Ex06 {// args 관련

	public static void main(String[] args) {
		int result;
		if(args[0].equals("/?")) {
			System.out.println("도움말 출력");
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
		String [] str = {"이숭무", "이상범", "이장범"};
		System.out.println(str[0]);
	}
}
