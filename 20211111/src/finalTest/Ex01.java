package finalTest;

public class Ex01 { // final의 유무에 따른 차이점
	
	int first;
	int second;
	
	public int add() {
		return first + second;
	}
	public final int div() { // final메서드
		return first / second;
	}
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
