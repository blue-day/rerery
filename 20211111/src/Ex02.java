
public class Ex02 {
	final int first;	// final은 초기값을 가져야만 함
	final int second;	// final 변수와 상수이름은 모두 대문자로 적기로 약속함.
	final String GOODS_PRICE;
	String name;
	// final에 초기값을 주지 않으려면 생성자를 적어야 함.
	public Ex02(int first, int second, String GOODS_PRICE) {
		this.first = first;
		this.second = second;
		this.GOODS_PRICE = GOODS_PRICE;
	}
	/* final의 변수는 setter를 통해서 값을 변경할 수 없다.
	public void setFirst(int first) {
		this.first = first;
	}*/
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public int getFirst() {
		return this.first;
	}
	public int getSecond() {
		return this.second;
	}

}
