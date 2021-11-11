
public class Ex03 {
	static String name;	// 정적 변수 : 모든 객체에서 값을 공유해 사용하기 위해서
	// 정적 변수 초기화 : static 블럭 이용

	// 상수
	static final int first;
	static final int second;
	// final 변수 : 객체마다 별도의 값을 가질 수 있다
	// final 변수 초기화 : 생성자 이용
	final int val1;	
	final int val2;
	static {
		name = "이숭무";
		first = 10;
		second = 5;	
	}
	public Ex03(int val1, int val2) {
		this.val1 = val1;
		this.val2 = val2;
	}
	//final 변수는 setter가 불가능하기 때문에 getter만 적용함
	public static String getName() {
		return name;
	}
	public static int getFirst() {
		return first;
	}
	public static int getSecond() {
		return second;
	}
	public int getVal1() {
		return val1;
	}
	public int getVal2() {
		return val2;
	}
	

}
