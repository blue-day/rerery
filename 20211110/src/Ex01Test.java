
public class Ex01Test {

	public static void main(String[] args) {
		Ex01 ex01 = new Ex01(20, 10);
		int result = ex01.add();	// 객체 내에 있는 함수를 외부에서 사용
					// ex01은 메서드 내에 있는 this에 전달
					// this.first = ex01.first
		System.out.println(result);
		result = add(30,10);
		System.out.println(result);
		Ex01 ex02 = new Ex01(50, 20);
		result = ex02.add();
	}
	public static int add(int num1, int num2) {
		return num1 + num2;
	}

}
