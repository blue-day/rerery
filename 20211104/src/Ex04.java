
public class Ex04 {

	public static void main(String[] args) {
		// 실수형 리터널 : 0.5, 10.6, 0.0
		// 소숫점을 가지고 있는 수를 실수라고 한다.
		float f; // 4바이트 : 정밀도가 낮다.
		double d; // 8바이트 : 정밀도가 높다.
		// 실수의 기본 크기 : 8 바이트
		d = 0.1234567890123456789;
		f = 0.1234567890123456789f; //데이터를 더 적을때 f를 붙여서 적을 수는 있지만 출력 시 강제형변환이 일어나 데이터 축약됨
		System.out.println(d);
		System.out.println(f);
		
		boolean b = true;
		boolean b1 = false;
		String str = "true"; //문자열
		//b = True; 대문자로 쓰면 오류
		System.out.println(b);
		System.out.println(b1);
		System.out.println(str);
		

	}

}
