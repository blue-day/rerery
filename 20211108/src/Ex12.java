
public class Ex12 { // for Each�� : for�� Ȯ��

	public static void main(String[] args) {
		int [] i = {1,2,3,4,5};
		int sum = 0;
		// 1���� �迭�� �հ踦 ���Ͻÿ�
		for(int j = 0; j <i.length; j++) {
			sum += i[j];
		}
		System.out.println(sum);
		System.out.println("================");
		sum = 0;
		for (int k : i) {// k = i[0], k = i[1], k = i[2],...,k = i[4]
			sum += k;
		}//�迭�� ũ�⸦ ���� ���밡��, �迭�� ũ�⸸ŭ�� �ݺ���.
		System.out.println(sum);
		System.out.println("================");
		int ii[][] = {{1,2,3,4},{5,6},{7,8,9,10,11}};
		sum = 0;
		for (int row = 0; row < ii.length; row++) {
			for(int col = 0; col < ii[row].length; col++) {
				sum += ii[row][col];
			}
		}
		System.out.println(sum);
		System.out.println("================");
		sum = 0;
		for(int []row : ii) {//row�� 1���� �迭 - ii�κ��� row��� 1���� �迭�� �޾ƿ��ڴ�.
							 // row = ii[0], row = ii[1],...
			for(int col : row) {//row��� �迭���� col�̶�� ���밪�� �޾ƿ�.(�迭 ����ũ�⸸ŭ �� ���� �޾ƿ�)
				sum += col;		// col = row[0], col = row[1],...
			}
		}
		System.out.println(sum);
	}

}
