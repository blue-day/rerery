package runtime_exception;

public class ThrowsExample {

	public static void main(String[] args) {
		try {
		test();	// 호출함수
		}catch(ArithmeticException e) {
			System.out.println(0);
		}

	}
	// 호출함수 쪽으로 예외처리를 하려면 throws연산자를 이용 뒤에 오류부분까지 적어줘야 한다.
	public static void test() throws ArithmeticException {
		int i = 2;
		int j = 0;
//		try {	<- 일반적 예외처리
			System.out.println(i / j);
//		}catch(ArithmeticException e) {
//			System.out.println(0);
	}
}


/*	at runtime_exception.ThrowsExample.test(ThrowsExample.java:12)
	at runtime_exception.ThrowsExample.main(ThrowsExample.java:6)
	: 아래(6)를 실행했더니 위(12)에서 오류가 떴다. 
*/