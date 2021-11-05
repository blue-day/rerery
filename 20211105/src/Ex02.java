
public class Ex02 {

	public static void main(String[] args) {
		// Math.random() : 0 <= Math.random() < 1
		int num = (int)(Math.random()*5 ) + 1; // 0 ~ 4.99999 (0~4)
		//                               + 1 // 1 ~ 5
		System.out.println(num);
		if (num == 1) {
			System.out.println('A');
		}else if (num == 2) {
			System.out.println('B');
		}else if (num == 3) {
			System.out.println('C');
		}else if (num == 4) {
			System.out.println('D');
		}else if (num == 5) {
			System.out.println('E');
		}// if문은 위에서부터 순서대로 OX를 실행하기 때문에 문장이 많을수록 속도가 저하된다.
		System.out.println("============switch=============");
		switch(num) {
		case 1 : System.out.println('A'); break;
		case 2 : System.out.println('B'); break;
		case 3 : System.out.println('C'); break;
		case 4 : System.out.println('D'); break;
		case 5 : System.out.println('E'); break;
		}//병렬식 연결로 바로 적용되는 case로 직행 - 조건식이 많다면 switch~case문을 쓰는게 더 좋다.

	}

}
