
public class Ex07 {// 자바에서는 생성자가 여러개다. /파이썬은 한개다.
	int first;
	int second;
	int result;
	// 값을 전달하지 않은 생성자 생성 // 디폴트 생성자.
	public Ex07() { // 생성자가 있는 경우 디폴트 생성자를 사용하기 위해선 명시적으로 만들어주어야 한다.
		System.out.println("디폴트 생성자 실행");
	} 
	// 디폴트 생성자 : 생성자를 만들지 않으면 자동으로 만들어지는 생성자
		//				(기본으로 존재하는 생성자)-개발자가 생성자를 만들면 따로 만들어지지 않음
	public Ex07(int first, int second) {
		this.first = first;
		this.second = second;
	}
	// setter
	public void setFirst(int first) {
		this.first = first;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	
	// getter
	public int getFirst() {
		return this.first;
	}
	public int getSecond() {
		return this.second;
	}
	public int getResult() {
		return this.result;
	}
	public void add() {
		this.result = this.first + this.second;
	}
	public void sub() {
		this.result = this.first - this.second;
	}

}
