
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b;
		b = -128;
		System.out.println(b);
		b = 127;
		System.out.println(b);
		//b = -129;
		//b = 128;
		
		char ch = 0; // ������ �ش��ϴ� ���ڴ� unicode�� �Ѵ�.
		System.out.println(ch); 
		ch = 65535;
		System.out.println(ch); //?
		ch = 65; //�빮�� A
		System.out.println(ch);
		ch = 97; //�ҹ��� = �빮�� + 32
		System.out.println(ch);
		ch = 'A' + 32;
		System.out.println(ch);
		// char�� ���ڸ� ��Ÿ���ִ� �ڷ���
		ch = '��';
		System.out.println((int)ch);
		ch = 44032;
		System.out.println(ch);//'��' = 44032
		
		short sh = - 32768;
		System.out.println(sh);
		sh = 32767;
		System.out.println(sh);
		//sh = -32769; <-short���� ����: -32768������ �Էµ�
		//sh = 32768; <-short���� ���� : 32767����
		
		int i = -2147483648;
		System.out.println(i);
		i = 2147483647;
		System.out.println(i);
		
		float f;
		f = 3.4f; // ���� �ڿ� ���ڸ� ������� ��
		System.out.println(f);
		
		double d = 3.4;
		System.out.println(d);
		
		long l = 10;
		System.out.println(l);
		l = 2000000000000l;
		System.out.println(l);
		//������ �⺻ũ��� 4byte : 2147483647������ �ν��� - �� ���� �Ѿ��'l'or 'L'�� ���� ���� ū������ ��Ÿ��
		//�Ǽ��� �⺻ũ��� 8byte - ������ float���� �Ǽ��� �������� �ڿ� f�� �ٿ��ش�.
		
	}

}
