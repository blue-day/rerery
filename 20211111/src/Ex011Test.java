
public class Ex011Test {

	public static void main(String[] args) {
		Ex01 ex01 = new Ex01();	// new를 붙일 시 새로운 주소 생성
		Ex01 ex02 = ex01; 	// 둘이 같은 객체임을 선언
							// 같은 주소를 가진다.
		
		Ex01 ex03 = new Ex01(); // 새로운 객체생성
		
		ex01.first = 30;
		System.out.println(ex01.first); // 30
		System.out.println(ex02.first); // 30
		System.out.println(ex03.first); // 0
		if(ex01 == ex02) {
			System.out.println("ex01과 ex02는 같은 객체이다.");
		}else {
			System.out.println("ex01과 ex02는 다른 객체이다.");
		}
		if(ex01 == ex03) {
			System.out.println("ex01과 ex03은 같은 객체이다.");
		}else {
			System.out.println("ex01과 ex03은 다른 객체이다.");
		}
		/// static 키워드가 있는 멤버 변수는 객체생성 없이 클래스명으로 접근(사용)할 수 있다.
		int result = Singleton.val; // private를 넣었을때는 직접접근이 허용되지 않았지만 지워서 가능해짐
		System.out.println(result);
		// getInstance = 30000이라는 주소를 가짐.
		Singleton s = Singleton.getInstance();	// s = 30000
		Singleton s1 = Singleton.getInstance();	// s1 = 30000
		if (s ==s1) {
			System.out.println("s와 s1은 같은 객체이다.");
		}else {
			System.out.println("s와 s1은 다른 객체이다.");
		}

	}

}
