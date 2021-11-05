
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b;
		b = -128;
		System.out.println(b);
		b = 127;
		System.out.println(b);
		//b = -129;
		//b = 128;
		
		char ch = 0; // 정수에 해당하는 문자는 unicode라 한다.
		System.out.println(ch); 
		ch = 65535;
		System.out.println(ch); //?
		ch = 65; //대문자 A
		System.out.println(ch);
		ch = 97; //소문자 = 대문자 + 32
		System.out.println(ch);
		ch = 'A' + 32;
		System.out.println(ch);
		// char는 문자를 나타내주는 자료형
		ch = '가';
		System.out.println((int)ch);
		ch = 44032;
		System.out.println(ch);//'가' = 44032
		
		short sh = - 32768;
		System.out.println(sh);
		sh = 32767;
		System.out.println(sh);
		//sh = -32769; <-short단위 변수: -32768까지만 입력됨
		//sh = 32768; <-short단위 변수 : 32767까지
		
		int i = -2147483648;
		System.out.println(i);
		i = 2147483647;
		System.out.println(i);
		
		float f;
		f = 3.4f; // 숫자 뒤에 문자를 적어줘야 함
		System.out.println(f);
		
		double d = 3.4;
		System.out.println(d);
		
		long l = 10;
		System.out.println(l);
		l = 2000000000000l;
		System.out.println(l);
		//정수의 기본크기는 4byte : 2147483647까지만 인식함 - 그 수를 넘어서면'l'or 'L'을 적어 보다 큰수임을 나타냄
		//실수의 기본크기는 8byte - 때문에 float에서 실수를 적을때는 뒤에 f를 붙여준다.
		
	}

}
