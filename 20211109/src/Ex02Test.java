
public class Ex02Test {

	public static void main(String[] args) {
		int i = 10;
		// cal = calculator() : 파이썬에서의 클래스 사용
		// cal.first = 10
		Ex02 ex02 = new Ex02();
	//	자료형 변수명(첫글자는 소문자)
		ex02.addr = "분당";
		ex02.age = 35;
		ex02.name = "이숭무";
		ex02.gender = false;
		System.out.println(ex02.addr);
		System.out.println(ex02.gender);
		
		Ex02 ex021 = new Ex02();
		ex021.addr = "분당";
		ex021.age = 18;
		ex021.name = "이상범";
		System.out.println(ex021.name);
		
		

	}

}
