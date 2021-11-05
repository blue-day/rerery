
public class Ex04 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6) + 1;
		if (num == 1 || num == 4) {
			System.out.println('A');
		}else if (num == 2 || num == 5) {
			System.out.println('B');
		}else if (num == 3 || num == 6) {
			System.out.println('C');
		}
		System.out.println("================switch================");
		num = 1;
		switch(num) {
		case 1: System.out.println('A');break;//case1을 실행하고 더이상 진행하지 마라
		case 4: System.out.println('A');
		case 2: System.out.println('B');
		case 5: System.out.println('B');break;//break를 만날때까지 계속 실행
		case 3: System.out.println('C');break;
		case 6: System.out.println('C');break;
		}
		num = 1;
		switch(num) {
		case 1:
		case 4: System.out.println('A');break;
		case 2:
		case 5: System.out.println('B');break;
		case 3:
		case 6: System.out.println('C');break;
		}

	}

}
