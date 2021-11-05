
public class Ex09 {

	public static void main(String[] args) {
		// 파이썬 : bool타입 not false = true; not true = false
		System.out.println(!true);
		System.out.println(!false);
		boolean b = true;
		System.out.println(!b);
		System.out.println(!!b);
		boolean b1 = false;
		System.out.println(!b1);//true
		System.out.println(!!b1);//false
		//단항 연산 : !, ++, --, -
		//true and true
		boolean b2 = true && true;
		System.out.println(b2);
		System.out.println(true && false);
		// true or true (or : ||)
		System.out.println(true || true);
		System.out.println(false || false);
		//논리연산자 : &&(and), ||(or)
		//비교연산자(=관계연산자) : >,<,<=,>=,==,!=
		int i = 10;
		int j = 20 ;
		System.out.println(i > j);
		System.out.println(i < j);
		System.out.println(i <= j);
		System.out.println(i >= j);
		System.out.println(i == j);
		System.out.println(i != j);
		boolean b3;
		b3 = i > j;
		System.out.println("b3 : " + b3);
		///문제 : 2200년은 윤년인지 구하시오
		// 4년마다 윤년, 100년마다 평년, 400년마다 윤년
		b3 = 2200 % 4 == 0 && 2200 % 100 != 0 
				|| 2200 % 400 == 0;
		System.out.println(b3);//평년
		
		float f = 10.1f;// 10.100000000(?)
		double d = 10.1;// 10.10000000000000000(?)
		boolean b4;
		b4 = f == d;
		System.out.println(b4);
		b4 = (double)f == d;
		System.out.println(b4);
		b4 = f == (float)d;
		System.out.println(b4);
		
		i = 10;
		d = 10.0;
		b4 = i == d;//4byte == 8byte => 8byte == 8byte
					//					10.0  == 10.0
		System.out.println(b4);
		int i3 = 65;
		int i4 = 75;
		int i5 = 85;
		boolean b5, b6, b7;
		b5 = i3 > i4;
		b6 = i4 < i5;
		b7 = b5 && b6;
		System.out.println(b5);
		System.out.println(b6);
		System.out.println(b7);
		b7 = i3 > i4 && i4 < i5;
		System.out.println(b7);
		
		b7 = b5 || b6;
		System.out.println(b7);
		b7 = i3 > i4 || i4 < i5;
		System.out.println(b7);
		
		
		
		
		
		
		
		
		
		
	}

}
