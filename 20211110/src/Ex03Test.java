
public class Ex03Test {

	public static void main(String[] args) {
		Ex03 ex031 = new Ex03();
		ex031.first = 10;
		ex031.second = 20;
		ex031.val = 30;
		
		Ex03 ex032 = new Ex03();
		System.out.println(ex032.first);	// 0
		System.out.println(ex032.second);	// 0
		System.out.println(ex032.val);		// 30
		System.out.println(Ex03.val);		// 30
		int result = ex031.add();
		System.out.println(result);			// 40
		result = ex032.add();
		System.out.println(result);			// 30
		
		result = Ex03.sub();	// 클래스명.
		// 메서드에 static키워드는 클래스명을 이용해 사용하기 위한 메서드이다.
		// 메서드 내에서 this키워드를 사용할 수 없다.
		
		result = ex031.sub();	// instance명

	}

}
