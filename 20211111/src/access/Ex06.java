package access;

import access.access1.Ex04;
import inheritance.Ex05;

public class Ex06 {

	public static void main(String[] args) {
		Ex04 ex04 = new Ex04();	// 다른 패키지에 있는 것
		// ex04.first;	// protected 멤버는 다른 패키지에서 상속은 되지만 
						// 다른 클래스에서 사용할 수는 없다.
		Ex03 ex03 = new Ex03();	// 다른 패키지에서 상속받은 것
		// ex03.first;
		Ex05 ex05 = new Ex05();	// 같은 패키지에서 상속
		// ex05.first;

	}

}
