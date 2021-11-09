
public class Ex071 {
	int first;
	// 디폴트 생성자 : 생성자를 만들지 않으면 자동으로 만들어지는 생성자
	//				(기본으로 존재하는 생성자)-개발자가 생성자를 만들면 따로 만들어지지 않음
	//				암시적으로 존재한다.(명시하지 않아도 존재)
	// public Ex071(){} 가 암시적으로 존재함.
	public void setFirst(int first) {
		this.first = first;
	}
	public int getFirst() {
		return this.first;
	}

}
