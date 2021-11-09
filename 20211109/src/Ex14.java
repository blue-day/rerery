
public class Ex14 {//메서드(함수)의 4가지 유형
	int result;// 멤버필드
	int first;
	int second;
	int add; //add : 변수
	public Ex14(int first, int second) {
		this.first = first; 	// 멤버필드와 매개변수를 구분하기 위해 this를 붙여 적음.(this. )
		this.second = second;	// 둘의 이름이 다르다면 굳이 적을 필요 없지만 개발 시 편의성을 위해 이름을 같게 지음
	}
	////// 메서드의 4가지 유형(함수)
	// 1. 입력값이 있고(매개변수가 있고) 결과값이 있는(반환형이 있는) 메서드
	public int add(int num1, int num2) { // add() : 함수 / 같은 이름의 변수와 함수가 존재할 수 있다.
		return num1 + num2;
	}//																이름의 순서는 상관 없음
	// 메서드 오버로딩 : 같은 이름의 함수가 존재하지만 매개변수가 다름 - 매서드의 순서(타입의 순서),갯수,타입 중 한개라도 달라야 함
	//			** 반환형이 다른것은 관계없이 같은걸로 적용되기 때문에 반환형만 다른 같은 함수를 적으면 오류
	public int div(int num1, int num2) {
		return num1 / num2;
	}
	// 2. 입력값(매개변수)은 있고 결과값(반환형)이 없는 메서드
	public void sub(double num1, int num2){ // 반환형이 없으므로 void 사용
		this.result = (int)num1 - num2;	// 여기서도 this. 를 붙일 필요 없지만 편의성(구분)을 위해 붙여서 사용
		System.out.println(this.result);
	}
		// 메서드 오버로딩 // 매개변수의 순서가 다름
	public int sub(int num1, double num2) {
		return num1 - (int)num2;
	}
	// 3. 입력값(매개변수)은 없고 결과값(반환형)이 있는 메서드
	public int mul() {
		return this.first * this.second;
	}
	// 4. 입력값(매개변수)이 없고 결과값(반환형)도 없는 메서드
	public void div() {
		System.out.println(this.first / this.second);
	}
}
