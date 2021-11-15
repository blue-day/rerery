package default_method_extends;

public class DefaultMethodExtendsExample {

	public static void main(String[] args) {
		ChildInterface1 ci1 = new ChildInterface1() {
			@Override
			public void method1() {
				System.out.println("ChildInterface1-method1-재정의");
			}
			@Override
			public void method3() {
				System.out.println("ChildInterface1-method3-재정의");
			}
		};
		ci1.method1();
		ci1.method2();	// default메서드
		ci1.method3();
		ChildInterface2 ci2 = new ChildInterface2() {
			@Override
			public void method1() {
				System.out.println("ChildInterface2-method1-재정의");
			}
			@Override
			public void method3() {
				System.out.println("ChildInterface2-method3-재정의");
			}
		};
		ci2.method1();
		ci2.method2();	// childInterface2에서 재정의 한 default 메서드
		ci2.method3();
		ChildInterface3 ci3 = new ChildInterface3() {
			@Override
			public void method1() {
				System.out.println("ChildInterface3-method1-재정의");
			}
			@Override
			public void method3() {
				System.out.println("ChildInterface3-method3-재정의");
			}
			@Override	// default 메서드를 꼭 재정의하도록 ChildInterface3에서 추상메서드로 오버라이딩을 해놓았기 때문에 재정의해야 함.
			public void method2() {
				System.out.println("ChildInterface3-method2-재정의");
			}
		};
		ci3.method1();
		ci3.method2();
		ci3.method3();	// default 메서드를 추상 메서드로 만들어서 재정의함.
	}

}
