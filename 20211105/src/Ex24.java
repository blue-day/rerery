import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int d,dan1,dan2;
		int g,gop1,gop2;
		String stop;
		do {//���Ǿ��� �ѹ��� �����϶�
			System.out.print("���� ���� �Է��Ͻÿ�.: ");
			dan1 = sc.nextInt();
			System.out.print("������ ���� �Է��Ͻÿ�.: ");
			dan2 = sc.nextInt();
			System.out.print("���� ���� �Է��Ͻÿ�.: ");
			gop1 = sc.nextInt();
			System.out.print("������ ���� �Է��Ͻÿ�.: ");
			gop2 = sc.nextInt();
			d = dan1;
			while (d <= dan2) {
				g = gop1;
				while (g <= gop2) {
					System.out.println(d + " * " + g + " = " + d*g);
					g++;
				}d++;
			}
			System.out.println("�����Ϸ��� 'y'�ƴϸ� �ƹ�Ű�� �����ÿ�");
			stop = sc.next();
		}while(!stop.equals("y"));

	}

}
