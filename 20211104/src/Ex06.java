
public class Ex06 {

	public static void main(String[] args) {
		// 정수는 기본 4바이트
		// 자료와 자료끼리의 연산이 아닌 정수와 정수끼리의 연산
		short sh1 = 32767;
		short sh2 = 32767;
		// short sh3 = sh1 + sh2;오류 -> 기억공간 안의 값끼리 연산하고 싶다면 틀림.
		//  int sh3    정수 + 정수 : 기억공간끼리의 연산이라 오류
		int sh3 = sh1 + sh2; //short ==> int 자동형변환이 됨.
		System.out.println(sh3);
		short sh4 = 10;
		short sh5 = 20;
		// short sh6 = sh4 + sh5;
		int sh6 = sh4 + sh5;
		System.out.println(sh6);
		short sh7 = (short)(sh4 + sh5);
		
		// sh7 = (short)sh4 + (short)sh5;
		//		4byte => 2byte =>4byte (정수끼리 연산 시 다시 자동으로 4byte가 되나봄
		int i = (short)sh4 + (short)sh5;
		int i1 = 10;
		int i2 = 3;
		double d1 = i1 / i2;
		//       4byte & 4byte = 10/3 = 3(정수 대 정수)
		System.out.println(d1);
		d1 = (double) i1/ i2;
		//    8byte   4byte => 8byte/8byte
		System.out.println(d1);
		
		float f1 = 3.5f;
		float f2 = 3.7f;
		float f3 = f1 + f2; // 실수인 경우 4바이트끼리 연산 가능
		System.out.println(f3);
		
		double d4 = 3.8;
		double d5 = f1 + d4; // ?자료형은 무엇이어야 할까
		System.out.println(d5);
		double d6 = 3.5 + 4; // 8byte + 4byte = 8byte +8byte
		
		short sh = -127;
		// -sh : 127 (--127)
		int ss = -sh; // 마이너스 연산
		System.out.println(ss);

	}

}
