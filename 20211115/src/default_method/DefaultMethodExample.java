package default_method;

public class DefaultMethodExample {
	public static void main(String[] args) {
		MyInterface mi1 = new MyClassA();
		mi1.method1();
		mi1.method2();	// ClassA에서 재정의하지 않은 default 메서드
		
		MyInterface mi2 = new MyClassB();
		mi2.method1();
		mi2.method2();	// 재정의한 default 메서드
	}

}
