
public class Ex12 { // for Each문 : for문 확장

	public static void main(String[] args) {
		int [] i = {1,2,3,4,5};
		int sum = 0;
		// 1차원 배열의 합계를 구하시오
		for(int j = 0; j <i.length; j++) {
			sum += i[j];
		}
		System.out.println(sum);
		System.out.println("================");
		sum = 0;
		for (int k : i) {// k = i[0], k = i[1], k = i[2],...,k = i[4]
			sum += k;
		}//배열의 크기를 몰라도 적용가능, 배열의 크기만큼만 반복함.
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
		for(int []row : ii) {//row는 1차열 배열 - ii로부터 row라는 1차원 배열을 받아오겠다.
							 // row = ii[0], row = ii[1],...
			for(int col : row) {//row라는 배열에서 col이라는 내용값을 받아옴.(배열 숫자크기만큼 각 값을 받아옴)
				sum += col;		// col = row[0], col = row[1],...
			}
		}
		System.out.println(sum);
	}

}
