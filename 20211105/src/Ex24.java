import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int d,dan1,dan2;
		int g,gop1,gop2;
		String stop;
		do {//조건없이 한번은 실행하라
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
			stop = sc.next();
		}while(!stop.equals("y"));

	}

}
