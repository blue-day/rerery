
public class Ex03 extends Ex02{	// 자식 클래스
	String subject;
	public Ex03(int radius, double pi, String subject) {
		super(radius, pi);
		this.subject = subject;
	}	// 같은 이름의 메서드에서 일부를 바꿔서 적용
	public double area() {	// 재정의 (오버라이딩)
		return radius * radius * Math.PI;
	}
	public double area(double p) {	// 오버로딩 : 그냥 같은 이름의 함수 사용은 안되지만 변수를 추가하면 가능
		return radius * radius * p;
	}
	public double area1() {
		return super.area();	// super.  : 부모 거를 사용한다.
	}

}
