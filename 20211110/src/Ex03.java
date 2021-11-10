
public class Ex03 {
	int first;
	int second;
	static int val;
	int val1;
	////				암시적으로 존재
	public int add( /* Ex03 this */ ) {	// 멤버 메서드 //static이 암시적 존재
		return val + this.first;
	}
	public static int sub() {	// static 메서드
		// return val - val1;	// static 메서드 내에서는 instance(객체)를 사용할 수 없다.
		return val;
	}

}
