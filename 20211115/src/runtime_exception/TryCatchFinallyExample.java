package runtime_exception;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		Point1 point = null; // Point point = new Point();
		try {
			point.print();
			//System.out.println("프로그램이 정상적으로 실행 중입니다.");
		}catch(NullPointerException e) {
			point = new Point1();
			point.print();
			//System.out.println("프로그램이 정상적으로 실행 중입니다.");
		}finally {
			System.out.println("프로그램이 정상적으로 실행 중입니다.");//try와 catch의 공통코드 : finally{}
		}
	}

}
class Point1{
	public void print() {
		System.out.println("출력");
	}
}