
public class Ex11 {//int [][] i = new int[4][5];

	public static void main(String[] args) {
		// 4�� 5��¥�� �迭�� ���� Math.random()�� �̿��Ͽ� ���� �����Ͻÿ�.
		// ���� 1~100������ ��
		int [][] i = new int[4][5];
		for(int j = 0; j < 4 ; j++) {
			for(int k = 0; k <5; k++) {
				i[j][k] = (int)(Math.random()* 100) + 1;
				System.out.println("i[" + j + "][" + k + "] = " + i[j][k]);
			}
		}
		System.out.println("=============");
		int i1[][] = new int[4][5];
		int row = 0;
		while (row < i1.length) {
			int col = 0;
			while (col < i1[row].length) {
				i1[row][col]=(int)(Math.random()* 100) + 1;
				System.out.println("i1[" + row + "][" + col + "] = " + i1[row][col]);
				col++;
			}
			row++;
		}

	}

}
