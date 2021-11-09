
public class Ex061 {
	String name;
	int age;
	double height;
	/// 자바에서는 생성자가 클래스명과 같아야 한다.//생성자는 앞에 void가 붙지 않는다.
// 생성자
// 접근지정자 클래스명(타입 매개변수,...)
	public Ex061(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
		System.out.println("생성자 실행");
	}
	// 메서드 (파이썬에서의 함수) : 클래스 안의 함수
	//	접근지정자 반환형 함수명  (매개변수)
	// setter
	//		반환형(void : 반환할 게 없다라는 의미)
	public void setAge(int age) {
		this.age = age;
	}
//	접근지정자 반환형 함수명  (매개변수)
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	//getter
	public int getAge() {
	//	  void 자리의 int : 정수를 반환
		return this.age;
	}
	public double getHeight() {
		return this.height;
	}
	public String getName() {
		return this.name;
	}
}
