import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
//		1. �ݺ��� ���� ���� i�� �ʱⰪ�� 1�̰� 10���� �ݺ� ������ �� �� i�� ��µǵ��� �Ͻÿ�.
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
//		2. �ݺ��� ���� ���� i�� �ʱⰪ�� 1�ϰ� 10���� �ݺ� ������ �� �� ���� y�� �ݺ��� ������ 1�� �����ϴ� ���� ��µǵ��� �Ͻÿ�.
		int y = 0;
		for(int i = 1; i <= 10; i++) {
			y++;
			System.out.println(y);
		}
//		3. �ݺ��� ���� ���� i�� 5ȸ �����ϴ� ���� �ʱ� �� 0�� ������ ����y1�� �ݺ��� �ȿ��� 1���� �ϵ��� �ϵ� ����y1��� �ݺ����ȿ��� 
//		   �ѹ��� 1���� �� ���� ��µǵ��� �Ͻÿ�. ���� y1�� 0�� �������� ���ÿ�. �� �ʱ�ȭ�� ����.
		for(int i = 1, y1 = 0; i <= 5; i++,y1++) {
			System.out.println(y1+1);
		}
//		4. �ݺ��� 10�� ������ �Ǵ� ���� "�̾��ڴ��� �������� �����ž��մϴ�."�� ����Ͻÿ�.
			for(int i = 1; i <= 10; i++) {
			System.out.println("�̾��ڴ��� �������� �����ž��մϴ�.");
		}
//		5. �ݺ� ���� i�� �ʱⰪ 10�� ������ ������ 10ȸ�� �ݺ��� �� ���� i�� ����� �� 2�� ������ ���� ��µǵ��� �Ͻÿ�.
			int i = 10;
			for(int n = 1; n<=10; n++) {
				i += 2;
				System.out.println(i);
		}
//		6. �ݺ� ���� i�� �ʱⰪ 10�� ������ ������ 10ȸ�� �ݺ��� �� ���� i�� ����� �� Ȧ�� ���� ��µǵ��� �Ͻÿ�.
			i = 10;
			for(; i < 20; i ++) {
				if(i%2==0) continue;
				System.out.println(i);
			}
//		7. �ݺ� ���� i�� �ʱⰪ 10�� ������ ������ 25ȸ�� �ݺ��� �� ���� i�� ����� �� 4�� ������ ���� ��µǵ��� �Ͻÿ�.
			for(i = 10; i < 35; i++) {
				if(i%4==2) {
					System.out.println(i);
				}else continue;
			}
//		8. �ݺ� ���� i�� 12���� 20ȸ�� �ݺ��� �� "������ ���Ϸ��� �ڹٸ� ���̼ž��մϴ�"�� 4ȸ�� ��µǵ��� �Ͻÿ�.(���̵� 2.5)
			for(i = 12; i<32; i++) {
				if(i<16) {
					System.out.println("������ ���Ϸ��� �ڹٸ� ���̼ž��մϴ�");
				}
			}
//		9. ������ 4���� ����Ͻÿ�.
			int d,g;
			d = 4;
			for(g = 1;g <= 9; g++) {
				System.out.println(d +" * " + g + " = " + d*g);
			}
//		10. ������ 6�� �� Ȧ�� ���� ����Ͻÿ�.
			d = 6;
			for(g = 1;g <= 9; g++) {
				if(g%2 == 0)continue;
				System.out.println(d +" * " + g + " = " + d*g);
			}
//		11. ������ 7���� ����ϵ� Ȧ������ ����ϵ� �ݺ������� ������� ����.
			d = 7;
			for(g = 1;g <= 9; g++) {
				if(g%2 == 0)continue;
				System.out.println(d +" * " + g + " = " + d*g);
			}
//		12. 10. ������ 6�� �� Ȧ�� ���� ����Ͻÿ�.
			d = 6;
			for(g = 1;g <= 9; g++) {
				if(g%2 == 0)continue;
				System.out.println(d +" * " + g + " = " + d*g);
			}
//		13. 1���� 10������ ���� ���Ͻÿ�.
			int sum = 0;
			for(i = 1;i <= 10; i++) {
				sum += i;
			}
			System.out.println(sum);
//		14. 10���� 1000������ ���� �����ÿ�.
			sum = 0;
			for(i = 10;i <= 1000; i++) {
				sum += i;
			}
			System.out.println(sum);
//		15. 6���� ����� �� 3������ 8�������� ����Ͻÿ�.
			d = 6;
			for(g = 3;g <= 8; g++) {
				System.out.println(d +" * " + g + " = " + d*g);
			}
//		16. Math.random()�Լ��� ����ؼ� 1���� 45������ ���� �� �� �ϳ��� ������ �ͼ� ���� �� ��ŭ 
//		    "������ ���Ϸ��� �ڹٸ� ���̼ž��մϴ�"�� ����Ͻÿ�. (���� ����, �ߺ� ���)
			int num1,num2,num3,num4,num5,num6;
			num1 = (int)(Math.random()*45)+1;
			for(i = 1; i <= num1; i++) {
				System.out.println("������ ���Ϸ��� �ڹٸ� ���̼ž��մϴ�");
			}

//		17. 1���� 45������ ���� �� �� ¦���ΰ͸� ���ϵ��� 3���� ����� �ݺ��� 10ȸ �Ѵ�.
			num2 = (int)(Math.random()*45)+1;
			for(i = 1; i <= 10; i++) {
				if(num2%2 != 0)continue;
				System.out.println(num2*3);
			}

//		18. 1���� 45�� ������ 6���� ������ ���ÿ� (���� ����, �ߺ� ���)
			num1 = (int)(Math.random()*45)+1;
			System.out.println(num1);
			num2 = (int)(Math.random()*45)+1;
			System.out.println(num2);
			num3 = (int)(Math.random()*45)+1;
			System.out.println(num3);
			num4 = (int)(Math.random()*45)+1;
			System.out.println(num4);
			num5 = (int)(Math.random()*45)+1;
			System.out.println(num5);
			num6 = (int)(Math.random()*45)+1;
			System.out.println(num6);
//		19. 3���� ����Ҷ� 2���� 5������ �� ����Ͻÿ�. ��, �ݺ� ������ ������� ���ÿ�.
			d = 3;
			for(g = 2;g <= 5; g++) {
				System.out.println(d +" * " + g + " = " + d*g);
			}

//		20. ���� x�� ���� z�� ���� �� �ݺ����� i�� x�� ������ �ִ� ������ z�� ������ �ִ� ������ ���� g��ŭ�� �����Ͽ� �ݺ��Ͽ�
//		     "�츮 �����Ͽ� ����� ���սô�"�� ����Ͻÿ�.
			Scanner sc = new Scanner(System.in);
			int x,z;
			System.out.print("���ۼ��ڸ� �Է��Ͻÿ�: ");
			x = sc.nextInt();
			System.out.print("���������ڸ� �Է��Ͻÿ�: ");
			z = sc.nextInt();
			System.out.print("�������� ���ڸ� �Է��Ͻÿ�: ");
			g = sc.nextInt();
			for(i = x; i <= z; i+=g) {
				System.out.println("�츮 �����Ͽ� ����� ���սô�");
			}
//		21. i�� 1���� 15���� 1�� �����Ͽ��� �ϸ� y�� 1000 ���� 10�� ���� �Ҷ��� ������ �̷������ �Ѵ�.
//		    �� �� "�ڹٴ� ���� ���"�̶�� ������ ��µǵ��� �Ͻÿ�.
			for(i = 1,y = 1000; i <= 15; i++,y-=10) {
				System.out.println("�ڹٴ� ���� ���");
			}
//		22. i�� 1����  1�� ������ ���� 15�̰ų�  y�� 1000 ���� 20�� ������ ���� 0�϶� ���� �ݺ��� �̷������ �Ѵ�.
			for(i = 1,y = 1000; i <= 15 && y<=0; i++,y-=20) {
				System.out.println(i);
				System.out.println(y);
			}
//		23. �������� ����Ͻÿ�.
		for(y = 1 ;  y <= 9; y++) {
			System.out.println(y + "��");
			for(i = 1; i <= 9; i++){
				System.out.println( y + " * " + i + "= " + y*i ); 
			}
		}		
//		24. 3�ܺ��� 8�ܱ��� ���
		for(y = 3 ;  y <= 8; y++) {
			System.out.println(y + "��");
			for(i = 1; i <= 9; i++){
				System.out.println( y + " * " + i + "= " + y*i ); 
			}
		}

//		25. 3�ܺ��� 7�ܱ��� ����� �ϴµ� 4������ 8�������� ����Ͻÿ�.
		for(y = 3 ;  y <= 7; y++) {
			System.out.println(y + "��");
			for(i = 4; i <= 8; i++){
				System.out.println( y + " * " + i + "= " + y*i ); 
			}
		}

		
//		26. 
//		6�� ����
//		6 * 4= 24
//		6 * 5= 30
//		6 * 6= 36
//		6�� ��
//		7�� ����
//		7 * 4= 28
//		7 * 5= 35
//		7 * 6= 42
//		7�� ��
		for(y = 6 ;  y <= 7; y++) {
			System.out.println(y + "�� ����");
			for(i = 4; i <= 6; i++){
				System.out.println( y + " * " + i + "= " + y*i ); 
			}
			;System.out.println(y + "�� ��");
		}

		
//		27. 
//		6�� ����
//		6 * 4= 24         6 * 5= 30         6 * 6= 36
//		6�� ��
//		7�� ����
//		7 * 4= 28         7 * 5= 35         7 * 6= 42
//		7�� ��
		for(y = 6 ;  y <= 7; y++) {
			System.out.println(y + "�� ����");
			for(i = 4; i <= 6; i++){
				System.out.print( y + " * " + i + "= " + y*i ); 
			}
			System.out.println(y + "�� ��");
		}//�ٹٲ��� ����
//		28. ������ ���� ������ ������ dan1�� dan2�� �ְ� ������ ���� ������ ������  gom1�� gom2�� �ִ� 
//		                         6     7                               4     6
//		     �� ������ �°� ��µ� �� �ְ� ���α׷��� �Ͻÿ�.
		int dan1,dan2;
		int gom1,gom2;
		dan1 = 6;
		dan2 = 7;
		gom1 = 4;
		gom2 = 6;
		for(y = dan1 ;  y <= dan2; y++) {
			System.out.println(y + "��");
			for(i = gom1; i <= gom2; i++){
				System.out.println( y + " * " + i + "= " + y*i ); 
			}
		}
//		29. html �� table �±� ���
//		<table>
//		<tr><td> 1 </td><td> 2 </td><td> 3 </td><td> 4 </td></tr>
//		<tr><td> 1 </td><td> 2 </td><td> 3 </td><td> 4 </td></tr>
//		<tr><td> 1 </td><td> 2 </td><td> 3 </td><td> 4 </td></tr>
//		<tr><td> 1 </td><td> 2 </td><td> 3 </td><td> 4 </td></tr>
//		</table>??????????????????????

		
		
//		30. 1���� 45������ �� �� 6���� �����Ͽ� ����ϴ� �� 6���� ���� 5�� ����Ͻÿ�.
		

	}

}
