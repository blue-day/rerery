package WrapperExmple;

public class ValueCompareEx {

	public static void main(String[] args) {
		int i1 = 10;
		int i2 = 10;
		if (i1 == i2) {
			System.out.println("같다");
		}
		Integer i3 = 10;
		Integer i4 = 10;
		if(i3 == i4) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		// unboxing
		if(i3.intValue() == i4.intValue()) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		i3 = 10;
		i4 = 10;	// -128 ~ 127
		System.out.println(i3 == i4);	// true
		System.out.println(i3.intValue() == i4.intValue());
		System.out.println(i3.equals(i4));
		i3 = 300;
		i4 = 300;	// -128 > x , 127 < x 일때는 타입이 맞지않아 ==으로 직접비교했을떄 false로 나옴.
		System.out.println(i3 == i4);	// false => 한정적 범위비교라 적합하지 않음.
		System.out.println(i3.intValue() == i4.intValue());
		System.out.println(i3.equals(i4));
	}

}
