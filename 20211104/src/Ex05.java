
public class Ex05 {

	public static void main(String[] args) {
		// 형변환
		// 자동형변환 : 작은 자료형이 큰 자료형으로 변환하는 것
		// 		1byte -> 2byte -> 4byte -> 8byte
		// 		1byte -> 8byte, 1byte -> 4byte
		// 		정수 --> 실수
		short sh = 30000;
		int i = sh; //자동형변환
		//short(2byte) -> int(4byte)
		float f = sh; // 정수 --> 실수 변환(자동형변환)
		System.out.println(i);
		System.out.println(f);
		double d = sh;
		System.out.println(d);
		// 강제형변환 : 큰 자료형이 작은 자료형으로 변환하는 것
		//		실수 --> 정수
		double d1 = 174.5;
		float f1 = 174.5f;
		int i1 = (int)f1;
		System.out.println(i1);
		i1 = (int)d1; // 실수 --> 정수
		System.out.println(i1);
		int i2 = 2100000000;
		short sh1 = (short)i2; // 4byte -> 2byte(큰형 ->작은형 : 강제형변환)
		/// 오버플로우가 발생해서 수가 달라질 수 있다.(조심)
		System.out.println(sh1);
		int i3 = 32000;
		short sh3 = (short)i3; // 오버플로우가 발생하지 않는다
		System.out.println(sh3);
		
		
		

	}

}
