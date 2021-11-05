import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		// num = int(input("첫번째숫자를 입력해주세요."))
		// 자바 : scanner
		/*
		Scanner sc = new Scanner(System.in);//객체 생성 필수
		System.out.println("이름을 입력하세요.: ");//ln은 라인.
		System.out.print("이름을 입력하세요.: ");//ln이 없다면 줄바꿈이 일어나지 않음
		String name = sc.next();//enter를 치면 실행종료.
		System.out.println("이름은 : " + name);
		System.out.print("숫자를 입력하세요.: ");
		int num = sc.nextInt();
		System.out.println("숫자 : " + num);
		*/
		//문제 : 단과 곱의 범위를 입력받아 구구단을 출력하시오.
		Scanner sc = new Scanner(System.in);
		int dan1,dan2;
		int gop1,gop2;
		System.out.print("시작 단을 입력하시오.: ");
		dan1 = sc.nextInt();
		System.out.print("마지막 단을 입력하시오.: ");
		dan2 = sc.nextInt();
		System.out.print("시작 곱을 입력하시오.: ");
		gop1 = sc.nextInt();
		System.out.print("마지막 곱을 입력하시오.: ");
		gop2 = sc.nextInt();
		int d,g;
		for(d = dan1; d <= dan2; d++) {
			for(g = gop1; g <= gop2; g++) {
				System.out.println(d + " * " + g + " = " + d*g);
			}
			
		}
		System.out.println("=========파이썬 스탈=========");
		while(true) {//조건없이 한번은 실행하라
			System.out.print("시작 단을 입력하시오.: ");
			dan1 = sc.nextInt();
			System.out.print("마지막 단을 입력하시오.: ");
			dan2 = sc.nextInt();
			System.out.print("시작 곱을 입력하시오.: ");
			gop1 = sc.nextInt();
			System.out.print("마지막 곱을 입력하시오.: ");
			gop2 = sc.nextInt();
			d = dan1;
			while (d <= dan2) {
				g = gop1;
				while (g <= gop2) {
					System.out.println(d + " * " + g + " = " + d*g);
					g++;
				}d++;
			}
			System.out.println("종료하려면 'y'아니면 아무키나 누르시오");
			String stop = sc.next();
			if(stop.equals("y")) {
				System.out.println("프로그램 종료");
				break;
			}
		}

	}

}
