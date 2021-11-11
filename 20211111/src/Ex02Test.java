
public class Ex02Test {

	public static void main(String[] args) {
		// final 변수는 생성자를 통해서 초기화 가능
		Ex02 ex02 = new Ex02(10,20,"룰루");	// final 변수의 초기값을 주어야만 함.
		// 그러나 초기화된 값을 변경하지 못한다. : 상수
		// ex02.first = 20;
		Ex02 ex021 = new Ex02(30,40,"따란");
		System.out.println(ex02.first);
		System.out.println(ex021.first);
		// 객체마다 final변수의 값을 별개로 가질 수 있다.

	}

}
