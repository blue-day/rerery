
public class Ex03 {
	int first;	// 멤버 필드
	int second;
	int result;
	public void setData(int first, int second){
		this.first = first;
	//		멤버필드	 매개변수
		this.second = second;
	}
	public void setFirst(int first) { // set 다음 첫글자는 대문자로
		this.first = first;
	}// setter : 멤버필드에 값을 지정해줄때/??
	public void setSecond(int second) {
		this.second = second;
	}
	public int getFirst() {
		return this.first;
	}// getter
	public int getSecond() {
		return this.second;
	}
	public void add() {
		this.result = this.first + this.second;
	}
	public void sub() {
		this.result = this.first - this.second;
	}

}
