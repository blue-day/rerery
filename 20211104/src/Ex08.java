
public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = - 128;
		System.out.println(-i);//���׿�����(���� 1��)
		//y = 3 + 4; //3�� ����
		int i1 = 1;
		i1 = i1 + 1; // i1 = 1 + 1 //1����
		System.out.println(i1);
		i1 = i1 + 1;
		System.out.println(i1);
		++i1; // i1 = i1 + 1 : ���࿬�� //���� 1�� : ���� ������
		System.out.println(i1);
		i1++; // i1 = i1 + 1 : ���࿬��
		System.out.println(i1);
		int y = ++i1; //i1 = i1 + 1; y = i1 : ���� : ���� �� ����
		              //i1 = 5 + 1 ; y = 6
		System.out.println(y);
		System.out.println(i1);
		y = i1++; // y = i1; i1 = i1 + 1 : ���� : ������ ���� �Ͼ�� �Ŀ� ����
		System.out.println(y); //������� �ʰ� �״�� 6
		System.out.println(i1);//����Ǿ� 7�� ��
		int i2 = 10;
		i2 = i2 -1; //1����
		System.out.println(i2);
		i2 = i2 -1; //1����
		System.out.println(i2);
		--i2; // i2 = i2 -1 : ����
		System.out.println(i2);
		i2--; //            : ����
		System.out.println(i2);
		y = --i2; // ���� : ���� �� ����
		System.out.println(y);
		System.out.println(i2);
		y = i2--; // ���� : ���� �� ����
		System.out.println(y);
		System.out.println(i2);
		
		i1 = 10;
		System.out.println(++i1);//���� //11
		System.out.println(i1);//11
		
		i1 = 10;
		System.out.println(i1++);//���� //10
		/*System.out.println(i1);
		 * i1 = i1 + 1
		 */
		System.out.println(i1);//11
		int i3 = 10;
		int j = 20;
		int z = ++i3 + j++;
		// i3 = i3 + 1 = 11
		// z = 11 + 20 = 31
		// j = j + 1 = 21
		System.out.println(z);
		System.out.println(i3);
		System.out.println(j);
		System.out.println("z = " + z);
		System.out.println("i3= " + i3);
		System.out.println("j = " + j);
		//������������ : ++, --
	}

}