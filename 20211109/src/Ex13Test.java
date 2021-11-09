
public class Ex13Test {

	public static void main(String[] args) {//메인 메서드
		/*
		 * // 6단 출력 
		 * for (int i = 1; i <=9; i ++) { 
		 * 		System.out.println("6 * "+ i + " = "+6*i); 
		 * } 
		 * // 8단 출력 
		 * for (int i = 1; i <=9; i ++) { 
		 * 		System.out.println("8 * "+ i + " = "+ 8*i); 
		 * } 
		 * // 3단 출력 
		 * for (int i = 1; i <=9; i ++) {
		 * 		System.out.println("3 * "+ i + " = "+ 3*i); 
		 * }
		 */
		gugu(3); // argument	// 같은 클래스 내에서 메서드호출 시 메서드값만 적으면 됨.
		gugu(6);				// 외부에서 불러올 때는 객체명.메서드() 형식으로 가능
		gugu(8);
		int result = 10 + 3;
		System.out.println(result);
		result = 30 + 6;
		System.out.println(result);
		result = add(20,10);
		System.out.println(result);
		int result1 = add(30, 10); // 다른 값을 갖기 위해서는 또다른 변수선언을 해야 함
		System.out.println(result1);
	} 	// 반복적으로 사용하는 코드가 있는 경우 함수로 저장해 적용
		//						dan : parameter : 매개변수
	public static void gugu(int dan) {
		for (int i = 1; i <=9; i ++) {
			System.out.println(dan+" * "+ i + " = "+ dan*i);
		}
	}//			 void : 연산된 값을 반환할 타입이 필요할때 대입하여 표현
	public static int add(int num1, int num2) {
		return num1 + num2;
	}

}
