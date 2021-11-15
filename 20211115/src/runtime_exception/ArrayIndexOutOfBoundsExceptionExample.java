package runtime_exception;
// 예외처리
public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String [] args) {
		// String [] args = {"1", "2"}
		//					  0    1
		// String [] args = {"1", "2", "3"}
		//					  0    1    2
		// String [] args = {"1", "2", "3", "4"}
		//					  0    1    2    3
		/*
		try {	// 예외처리 : 오류가 발생할때 오류대신 실행이 가능하도록 함
		String data1 = args[0];
		String data2 = args[1];
		String data3 = args[2];
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("입력 값은 3개여야 합니다.");
		}
		*/
		if (args.length == 3) {
			String data1 = args[0];
			String data2 = args[1];
			String data3 = args[2];
			System.out.println(data1);
			System.out.println(data2);
			System.out.println(data3);
		}else {
			System.out.println("입력 값은 3개여야 합니다.");
		}
	}

}
