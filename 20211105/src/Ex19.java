
public class Ex19 {

	public static void main(String[] args) {
		// for�� 3�ܺ��� 7�ܱ��� 4������ 6������
		//		1		2		4
		for(int d = 3; d <= 7; d++) {//for(; : ���� ���� �״�� �����´ٴ� �� ����)
			// 3����
			//		3-1		3-2		3-4
			for(int g = 4; g <= 6; g++) {
				//3-3
				System.out.println(d+ " * "+ g + " = "+ d*g);
			}//��
		}System.out.println("===============");
		int d = 3;
		while(d <= 7) {
			//3
			int g=4;//3-1
			while (g<=6) {//3-2
				//3-3
				System.out.println(d+ " * "+ g + " = "+ d*g);
				g++;//3-4
			}
			d++;//4
		}
		

	}

}
