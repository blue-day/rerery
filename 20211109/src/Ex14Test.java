
public class Ex14Test {

	public static void main(String[] args) {
		Ex14 ex14 = new Ex14(50,20);
		int num = ex14.add(20, 10);
		System.out.println(num);
		ex14.sub(30.0, 15); 	// 변수에 대입 안됨. 반환값이 없기 때문
		num = ex14.mul(); 	// 매개변수가 없기 때문에 입력값이 없음
		System.out.println(num);
		ex14.div(); 		// 반환값이 없기에 변수대입 안됨. 매개변수도 없어서 입력값 없음
		ex14.add = 10;
		System.out.println(ex14.add);

	}

}
