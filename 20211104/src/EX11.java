
public class EX11 {

	public static void main(String[] args) {
		/* if ���ǽ�:
		 * 		��ɾ�1
		 * 		��ɾ�2
		 * 		...
		 */
		/*if(���ǽ�){
		 * 		��ɾ�1; /�鿩���⸦ ���� �ʾƵ� ������ �ƴ����� �������� ���� �鿩������
		 * 		��ɾ�2;
		 * 		...
		 * }
		 */
		int i = 10;
		if (i < 20) System.out.println("�۴�");//��ɾ �ϳ���� �߰�ȣ �ʿ����
		if (i > 20) {
			System.out.println("i�� ");
			System.out.println("10���� �۴�");
			System.out.println("...");
		}
		int money = 3000;
		//���� 3000���� �ʰ��ϸ� ���� Ÿ�� ���ÿ�.
		if (money > 3000)
			System.out.println("���� Ÿ�� ���ÿ�");//�鿩����� ������� ù�ٸ� if���� ���ӵ�
			System.out.println("if���� ����Ǿ����ϴ�.");
		if (money > 3000) {
			System.out.println("���� Ÿ�� ���ÿ�");
		}
		System.out.println("if���� ����Ǿ����ϴ�.");
		if (money > 3000)
			System.out.println("���� Ÿ�� ���ÿ�");
			
		System.out.println("if���� ����Ǿ����ϴ�.");
	}

}
