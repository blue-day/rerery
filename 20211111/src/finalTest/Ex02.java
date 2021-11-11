package finalTest;

public class Ex02 extends Ex01 {
	public int sub() {
		return first - second;
	}
	public int mul() {
		return first * second;
	}
//	@Override : 재정의
//	public int div() { // final 메서드는 재정의 할 수 없다.
//		if(second == 0) {
//			return 0;
//		}else {
//			return first / second;
//		}
//	}

}
