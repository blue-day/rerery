package runtime_exception;

import java.util.HashMap;

public class ClassNotFoundExceptionEx {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.util.List");	// 클래스 비교에 클래스가 존재하지 않을 수 있기 때문에 오류에 대한 처리를 적어달라고 나옴.
			System.out.println("클래스가 있습니다.");
		}catch(ClassNotFoundException e) {
			System.out.println("클래스가 없습니다.");
		}
		/*catch(ClassNotFoundException e) {
			e.printStackTrace(); : 에러메세지를 출력하라는 의미
		} // 오류로 인한 프로그램종료가 되는 게 아니라 개발자가 오류를 확인하기 위한 코드.
			여전히 프로그램 진행됨.
		*/
	}

}
