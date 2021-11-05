
public class Ex07 {

	public static void main(String[] args) {
		char ch1 = 'A' + 1;//2byte + 2byte : 문자 + 2byte(숫자)
		System.out.println(ch1);
		char ch2 = 'C'; //정수 //변수 선언
		char ch3 = (char)(ch2 + 1); //(char)(4byte + 4byte)
		
		short sh = 65 + 60; //
		short sh1 = 65;
		short sh2 = 60;
		short sh3 = (short)(sh1 + sh2);
		
		float f1 = 10.5f;
		double d1 = 10.6;
		double d2 = f1 + d1;
		System.out.println(d2);
		
		int result = (int)10.5 + 4;
		System.out.println(result);
		
		/*자료형 :
		 * 정수 : byte, char, short, int, long
		 * 실수 : float, double
		 * 문자열 : string ("")
		 * 문자 : char('')
		 * 부울 : true, false : 1byte
		 * *char - 문자 / 정수
		 */
		char ch = 'a';
		ch = 97;
	}

}
