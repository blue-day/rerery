
public class Ex11 {//int [][] i = new int[4][5];

	public static void main(String[] args) {
		// 4행 5열짜리 배열을 만들어서 Math.random()을 이용하여 값을 저장하시오.
		// 랜덤 1~100까지의 수
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
