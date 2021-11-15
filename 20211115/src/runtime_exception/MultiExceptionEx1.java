package runtime_exception;

public class MultiExceptionEx1 {

	public static void main(String[] args) {
		int data1 = Integer.parseInt(args[0]);
		int data2 = Integer.parseInt(args[1]);
		try {
			System.out.println(data1);
			System.out.println(data2);
			System.out.println( data1 / data2 );
		}catch(ArrayIndexOutOfBoundsException e) {	// 아래로 넘어가기 전에 처리할 작은 것은 위로 적어준다.
			System.out.println("입력값이 2개가 필요합니다.");
		}catch(Exception e) {						// 모든 에러를 다 통틀어 처리한다.
			if(data2 == 0)
				System.out.println(0);
			else
				System.out.println(data1 / data2);
		}

	}

}
