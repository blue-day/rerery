package WrapperExmple;

public class WrapperEx {

	public static void main(String[] args) {
		Integer i = 100; //	박싱 boxing
		int i1 = i;	// Integer -> int 변환	: 언박싱 unboxing
		int i2 = 20;
		//		자동 언박싱	: 자동형변환이 됨.
		int result = i + i2;
		
//		Integer i3 = new Integer(10);
//		Integer i4 = new Integer("10");
		Integer i5 = Integer.valueOf("300");
		Integer i6 = 10;
		
		int i7 = i6;	// 자동 언박싱
		i7 = i6.intValue();	// unboxing	<- 굳이 이렇게 할 필요없음.
		
		int i8 = 10;
		Integer i9 = 10;
		i9 = i8;
		i8 = i9;

	}

}
