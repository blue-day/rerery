
public class Ex14 {

	public static void main(String[] args) {
		/*i = 1          #1
		 * while i <= 9: #2
		 * 		print(i) #3
		 * 		i += 1   #4 -> #1...
		 */
		// for���� �������
		//		1		2		4		
		for(int i = 1; i <= 9; i++) {
			// 3
			System.out.println("5 *"+ i +" = " + 5*i);
		}//1 -> 2 -> 3 -> 4 -> 2 -> 3 -> 4 -> ... -> 2���� ������������ ������ ����
		int i = 1;
		for (; i <=9; ){//2
			// 3
			System.out.println("5 *"+ i +" = " + 5*i);
			i ++;//4
		}
		System.out.println("=======While=======");
		i = 1;
		while (i <= 9) {
			System.out.println("5 *"+ i +" = " + 5*i);
			i ++;
		}
		System.out.println("==============");
		//while������ 3���� ���
		i = 1;
		while(i <=9) {
			System.out.println("3 *"+ i +" = " + 3*i);
			i ++;
		}
		System.out.println("==============");
		int gop = 1;
		for(gop = 3; gop <= 7; gop++) {
			System.out.println("3 *"+ gop +" = " + 3*gop);
		}
		System.out.println("==============");
		gop = 3;
		while (gop<=7) {
			System.out.println("3 *"+ gop +" = " + 3*gop);
			gop++;
		}

	}

}
