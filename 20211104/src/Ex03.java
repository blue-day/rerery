
public class Ex03 {

	public static void main(String[] args) {
		int i  = 10;
		System.out.println(i);
		//i = "10"; 문자열
		String str = "10"; ///문자열인 경우 : ""
		System.out.println(str);
		
		//char ch = '10'; 문자열(1문자 0문자가 합쳐져 있는 형태이므로 오류.char는 문자열이 아닌 문자 리터널만 가능)
		char ch = '0'; //문자인 경우 : ''
		System.out.println(ch);
		ch = '9';
		System.out.println(ch);
		
		ch = 0;   //공백문자
		System.out.println(ch);
		ch = '0'; //'0' = 48(0이라는 문자를 나타내는 숫자)
		System.out.println(ch);
		System.out.println((int)ch);
		//String str1 = 'a'; 문자열을 저장하기 위한 자료형
		//char ch1 = "a"; 문자 리터널을 저장하기 위한 자료형

	}

}
