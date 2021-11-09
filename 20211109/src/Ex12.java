
public class Ex12 {
	int first;
	int second;
	public void setFirst(int first) {
		this.first = first;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public int add() {
		return this.first + this.second;
	}
	public int sub() { //int : return문 뒤의 값을 적을 수 있는 타입을 적어야만 한다.
		return this.first - this.second;	// return : 호출값에 반환한다.
	}
	public String getName() {
		return "이숭무";
	}

}
