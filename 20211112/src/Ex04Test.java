
public class Ex04Test {

	public static void main(String[] args) {
		B b = new B();	// A
		C c = new C();	// A
		D d = new D();	// B, A
		E e = new E();	// C, A
		// 다형성	* 부모는 자식 객체를 참조할 수 있다.
		//		* 자식은 부모를 상속받아야지만 참조가능하다.
		//		* 
		A a = b;	// a가 b가 됨
		a = c;		// a가 c가 됨
		a = d;		// a가 d가 됨
		a = e;		// a가 e가 됨
		a.method0();
		A a1 = new A();
		a1.method0();

	}

}
