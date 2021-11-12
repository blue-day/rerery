
public class Ex03Test {

	public static void main(String[] args) {
		Ex03 ex03 = new Ex03(3, 3.141592, "테스트1");
		System.out.println(ex03.subject);
		double d = ex03.area();	// 오버라이딩이 된 area를 씀
		System.out.println(d);
		d = ex03.area(Math.PI);	// 오버로딩이 된 area
		System.out.println(d);	// Math.pi사용
		System.out.println(Math.PI);
		d = ex03.area1(); // 부모가 가지고 있는 area를 가져와 사용
		System.out.println(d);	// pi의 일부숫자 사용

	}

}
