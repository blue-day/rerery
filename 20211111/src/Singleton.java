
public class Singleton {
	int first;
	int second;
	//// 싱글톤
			static 		int 	val 	   = 	10;
	private static Singleton singleton = new Singleton();	// 30000 이라고 하자
	
	private Singleton() {}
	public static Singleton getInstance() {	// 자신의 객체를 전달 // 메서드의 이름은 중요하지 않음.
		return singleton;
	}
	////
	public int getFirst() {
		return first;
	}
	public void setFirst(int first) {
		this.first = first;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
}

