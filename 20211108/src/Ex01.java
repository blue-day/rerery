
public class Ex01 {

	public static void main(String[] args) {
		// 변수 값을 10개 저장
		// 학생의 수가 10명이라 10개의 정수를 저장해야 함.
		int score1 = 20;
		int score2 = 20;
		int score3 = 20;
		int score4 = 20;
		int score5 = 20;
		int score6 = 20;
		int score7 = 20;
		int score8 = 20;
		int score9 = 20;
		int score10 = 20;
		/// 변수 하나에 10개의 값을 저장하도록 만들기( : 배열)
		int [] score = {1,2,3,4,5,6,7,8,9,10};
		//				0 1 2 3 4 5 6 7 8 9
		// 파이썬의 리스트는 여러 유형의 데이터를 여러개 저장가능
		// 자바에서의 배열은 하나의 자료형 데이터를 여러개 저장가능
		System.out.println(score[5]);
		double [] d = { 10.5, 10.5, 12.5, 12.6};
		//				  0     1     2     3
		// 배열을 사용할때는 indexing을 한다.
		System.out.println(d[3]);
		// 배열의 모든 데이터 출력
		for(int i = 0; i <= 3; i ++) {
			System.out.println(d[i]);
		}
		//score에 있는 값을 모두 더하시오.
		int sum = 0;
		for(int i = 0; i <= 9; i++) {
			sum += score[i];
		}
		System.out.println(sum);

	}
}
