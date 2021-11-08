
public class Ex13 {

	public static void main(String[] args) {
		// 3행 4열인 2차원 배열에 1~100까지 사용하는 Math.random()을 이용하여 값을 입력한 후 합계를 출력하시오.
		int i[][] = new int[3][4];
		int sum = 0;
		for(int row[] : i) {
			for(int col : row) {
				col = (int)(Math.random()* 100) + 1;
				sum += col;
			}
		}
		System.out.println(sum);
		// for Each문을 사용해서는 배열의 값을 저장할 수 없어 for문이나 while문 사용
		int ii[][] = new int[3][4];
		for(int row = 0; row<ii.length; row++) {
			for(int col = 0; col < ii[row].length; col++) {
				ii[row][col] = (int)(Math.random()* 100) + 1;
			}
		}
		sum = 0;
		for(int row[] : ii) {
			for(int col : row) {
				sum += col;
			}
		}
		System.out.println(sum);
		int [] score = {60,89,56,73,66,90,95};
		// 합계와 평균을 foreach문을 사용해서 구하시오.
		sum = 0;
		for(int s : score) {
			sum += s;
		}
		System.out.println("합계 = "+ sum);
		System.out.println("평균 = "+ sum/score.length); //%는 나머지,/는 나누기
	}
}
