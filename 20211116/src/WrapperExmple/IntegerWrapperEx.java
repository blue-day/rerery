package WrapperExmple;

public class IntegerWrapperEx {

	public static void main(String[] args) {
		int i = 10;
		String s = "10";
		
		Integer i1 = 10;	// int와 같음. Wrapper자료형
		i1 = Integer.parseInt(s);
		byte by = 10;
		Byte by1 = 10;		// wrapper클래스
		
		short sh = 10;
		Short sh1 = 10;
		
		double d = 10.5;
		Double d1 = 10.5;
		
		float f = 10.5f;
		Float f1 = 10.6f;
//		일반 자료형은 null(값은 존재하되 어떠한 값인지 모르는 것)을 대입할 수 없다.
//		Wrapper자료형은 null값을 저장하기 위해 주로 사용.
		// 문자열을 숫자로 변환할때도 사용.

	}

}
