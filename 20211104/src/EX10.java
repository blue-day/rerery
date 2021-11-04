
public class EX10 {

	public static void main(String[] args) {
		// 대입연산자 : =
		int i = 10;
		System.out.println(i);
		i += 1; // i = i + 1 , i++
		System.out.println(i);
		i += 2; // i = i + 2
		System.out.println(i);
		i -= 2; // i = i - 2
		System.out.println(i);
		i *= 2; // i = i * 2
		System.out.println(i);
		i /= 2; // i = i / 2
		System.out.println(i);
		i %= 3; // i = i % 3
		System.out.println(i);
		
		int a,b,c;
		a = b = c = 100;
		String str = "hello " + "java";
		System.out.println(str);
		String str1 = "hello";
		String str2 = "java";
		str = str1 + " " + str2;
		System.out.println("a, b,c 는" + 100);//문자 리터널과 숫자 리터널의 연산이 가능함
		
		str = "3 * 7 = " + 21; //숫자가 문자열로 자동형변환이 됨
		System.out.println(str);
		
		//삼항 연산자
		i = 70;
		System.out.println(i > 60 ? "합격" : "불합격");
		//                  조건식 ?  true :  false
		System.out.println(i < 60 ? "합격" : "불합격");
		/*if (i > 60){
		 * 		System.out.println("합격");
		 * }else{
		 * 		System.out.println("불합격");
		 * }
		 */
		// //(몫), **(제곱승)은 자바에선 없음.함수로 표현
		
	}

}
