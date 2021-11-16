package StringClass;

public class StringMethod {

	public static void main(String[] args) {
		String ssn = "010624-1230123";	// ssn : 주민등록번호 -> 앞에 0이 있기때문에 절대 숫자로 인식되지 않음.
		//			  01234567890123							맨 앞에 0을 넣는다면 문자열로 적용해야만 가능.
		System.out.println(ssn.charAt(7));	//					특수문자가 중간에 끼어있어도 무조건 문자열.
		String str = "나는 자바가 너무 재미있어요.";
		//			  01  2345 678 90123 45
		System.out.println(str.charAt(10));
		// charAt() : index에 해당하는 문자를 가져옴
		char ch = ssn.charAt(7);
		switch(ch) {
		case '1' :System.out.println("남자"); break;
		case '2' :System.out.println("여자"); break;
		case '3' :System.out.println("남자"); break;
		case '4' :System.out.println("여자"); break;
		}
		// Method 정리
		String str1 = "apple";
		boolean b1 = str1.startsWith("ap");	// 앞글자의 시작을 알고 싶을떄.
		System.out.println(b1);
		b1 = str1.startsWith("le");
		System.out.println(b1);
		
		b1 = str1.endsWith("le");	// 끝글자의 참거짓
		System.out.println(b1);
		
		str = new String("java");	// String : Wrapper클래스의 읠종임.
		str1 = new String("java");
		System.out.println(str1 == str);	// false
		System.out.println(str1.equals(str));
		
		str1 = "I like the java";
		//      012345678901234
		System.out.println(str1.indexOf("t"));	// 문자의 인덱스번호를 알아오는 것.
		System.out.println(str1.indexOf("a"));
		System.out.println(str1.lastIndexOf("a"));	// 문자의 인덱스를 뒤에서부터 찾음.

		int start = str1.indexOf("t");
		System.out.println(str1.substring(start, start + 8));
		
		System.out.println(str1.length());	// 자료형의 크기를 알아오는 것. 배열에서는 ()가 없지만 그 외에는 ()를 넣어야만 한다.
		int [] ii = new int[5];
		System.out.println(ii.length);
		
		// I를 We로	-> 원래는 char이기 때문에 ''로 묶은 문자 자료형을 사용해 i로 바꾸는 것을 보여줬지만 출력은 똑같이 나옴.
		System.out.println(str1.replace("I", "We"));
		// I를 You로	: 정규표현에 해당하는 문자를 변경
		System.out.println(str1.replaceAll("I", "You"));
		
		str = "A:B:C:D:abcd";	// 문자열을 split하면 배열로 저장됨.
		String [] str2 = str.split(":");
		System.out.println(str2[1]);
		str = "A B C D abcd";
		str2 = str.split(" ");
		System.out.println(str2[1]);
		
		// slicing : a = "abcdef" : a[1:3] => substring (자바에서의 slicing)
		str1 = "abcdef";
		System.out.println(str1.substring(1,3));	// 슬라이싱과 번호가져오는 것은 같음.
		
		str1 = "abcDEF";
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		
		Integer i = 10;
		str = "10" + i.toString();	// 숫자를 문자로 전환
		System.out.println(str);
		
		str1 = "  abc DEF  ";	// strip => trim : 양옆의 공백문자 제거
		System.out.println(str1.trim());
		
		str = "A:B/C-D,abcd";
		str2 = str.split(":|/|-|,");
		System.out.println(str2[1]);
		
		
		
		
	}

}
