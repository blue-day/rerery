
public class Ex01Test {

	public static void main(String[] args) {
		Ex01 ex01 = new Ex01();
		Ex01 ex02 = new Ex01();
		Ex01 ex03 = new Ex01();
		if (ex01 == ex02){ // 서로 같은 객체를 가졌는지 묻는 거지만 서로 다른 주소번지를 가짐.
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		// 둘이 서로 같다면 한쪽에 값을 대입하면 다른 쪽도 자동으로 같은 값이 대입되어야 한다.
		// 하지만 그렇게 되지 않기 때문에 서로 다르다.
		ex01.first = 20;
		System.out.println(ex02.first);// 0
		System.out.println(ex01.first);// 20
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		if(s1 == s2) {
			System.out.println("s1과 s2는 같다.");
		}else {
			System.out.println("s1과 s2는 다르다.");
		}

	}

}
