
public class Ex18 {

	public static void main(String[] args) {
		// 3�ܺ���  7�ܱ��� ����Ͻÿ�(while)
		int d = 3;
		while (d <= 7) {//??????//
			int g = 1;//���⿡ ����� d�� �ٲ� �ٽ� 1���� ���ư�
			while (g <= 9) {
				System.out.println(d + " * " + g + " = " + d*g);
				g++;
			}
			d++;
		}

	}

}
