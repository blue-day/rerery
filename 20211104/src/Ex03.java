
public class Ex03 {

	public static void main(String[] args) {
		int i  = 10;
		System.out.println(i);
		//i = "10"; ���ڿ�
		String str = "10"; ///���ڿ��� ��� : ""
		System.out.println(str);
		
		//char ch = '10'; ���ڿ�(1���� 0���ڰ� ������ �ִ� �����̹Ƿ� ����.char�� ���ڿ��� �ƴ� ���� ���ͳθ� ����)
		char ch = '0'; //������ ��� : ''
		System.out.println(ch);
		ch = '9';
		System.out.println(ch);
		
		ch = 0;   //���鹮��
		System.out.println(ch);
		ch = '0'; //'0' = 48(0�̶�� ���ڸ� ��Ÿ���� ����)
		System.out.println(ch);
		System.out.println((int)ch);
		//String str1 = 'a'; ���ڿ��� �����ϱ� ���� �ڷ���
		//char ch1 = "a"; ���� ���ͳ��� �����ϱ� ���� �ڷ���

	}

}
