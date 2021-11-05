
public class Ex01 {

	public static void main(String[] args) {
		/// 리터널 : 자연어 : 한국어, 영어,... / 자연수 : 정수, 실수
		/*	자료형 :	정수 - byte(1), char(2), short(2), int(4), long(8) : 담을 수 있는 숫자의 크기
		 * 			실수 - float(4), double(8)
		 * 			문자 - char(2) : 'a', '가'
		 * 			문자열 - String : "abc", "가나", "a", "가"(문자가 하나밖에 없어도 ""로 묶으면 문자열 취급
		 */
		//형변환 : 자동형변환, 강제형변환
		short sh = 10;
		int i = sh; // 자동 형변환
		sh = (short)i;// 강제형변환(큰걸 작은단위에 욱여넣으려면 앞에 붙여줘야 함)
		short sh1 = 10;
		short sh2 = 20;
		//short sh3 = sh1 + sh2; //변수에 숫자를 저장할 수는 있지만 연산을 하면 원래 용량크기로 변환되기때문
		int i1 = sh1 + sh2;
		short sh4 = (short)(sh1 + sh2);
		//short sh5 = (short)sh1 + (short)sh2;
		//             4byte => 2byte => 4byte
		//                 강제형변환  자동형변환
		//byte => char => short => int => long => float => double
		// 이 방향으로는 언제든 자동형변환이 일어난다.
		
		// 제어문 : 조건문, 반복문
		// if, if ~ else, if ~ elif(else if) ~...~ else
		// switch ~ case
		int money = 3000;
		if (money >= 3000) {
			System.out.println("차를 타고 가시오.");
		}
		if (money >= 3000) {
			System.out.println("차를 타고 가시오.");
		}else {
			System.out.println("걸어가시오.");
		}
	}

}
