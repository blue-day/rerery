import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		// num = int(input("ù��°���ڸ� �Է����ּ���."))
		// �ڹ� : scanner
		/*
		Scanner sc = new Scanner(System.in);//��ü ���� �ʼ�
		System.out.println("�̸��� �Է��ϼ���.: ");//ln�� ����.
		System.out.print("�̸��� �Է��ϼ���.: ");//ln�� ���ٸ� �ٹٲ��� �Ͼ�� ����
		String name = sc.next();//enter�� ġ�� ��������.
		System.out.println("�̸��� : " + name);
		System.out.print("���ڸ� �Է��ϼ���.: ");
		int num = sc.nextInt();
		System.out.println("���� : " + num);
		*/
		//���� : �ܰ� ���� ������ �Է¹޾� �������� ����Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		int dan1,dan2;
		int gop1,gop2;
		System.out.print("���� ���� �Է��Ͻÿ�.: ");
		dan1 = sc.nextInt();
		System.out.print("������ ���� �Է��Ͻÿ�.: ");
		dan2 = sc.nextInt();
		System.out.print("���� ���� �Է��Ͻÿ�.: ");
		gop1 = sc.nextInt();
		System.out.print("������ ���� �Է��Ͻÿ�.: ");
		gop2 = sc.nextInt();
		int d,g;
		for(d = dan1; d <= dan2; d++) {
			for(g = gop1; g <= gop2; g++) {
				System.out.println(d + " * " + g + " = " + d*g);
			}
			
		}
		System.out.println("=========���̽� ��Ż=========");
		while(true) {//���Ǿ��� �ѹ��� �����϶�
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
			String stop = sc.next();
			if(stop.equals("y")) {
				System.out.println("���α׷� ����");
				break;
			}
		}

	}

}
