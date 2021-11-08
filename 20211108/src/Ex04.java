
public class Ex04 {

	public static void main(String[] args) {
		// 배열의 크기 가져오기 : (배열명.length)
		int i[] = new int[] {1,2,3,4,5};
		//					 0 1 2 3 4
		System.out.println(i.length);	// 5
		// 배열에 있는 값의 합계를 구하시오
		int sum = 0;
		for(int j = 0; j < i.length; j++) {
			sum += i[j];
		}
		System.out.println(sum);
		// 크기가 10인 배열을 만들고 Math.random(랜덤값 1~100)을 이용해서 배열에 임의의 값을 저장하시오.
		int j[] = new int[10];
		for(int k = 0; k < j.length; k++) {
			j[k] = (int)(Math.random()* 100) + 1;
		}// k가 0부터 9까지 임의의 값을 저장
		/* j[0] = (int)(Math.random() * 100) + 1;
		 * j[1] = (int)(Math.random() * 100) + 1;
		 * j[2] = (int)(Math.random() * 100) + 1;
		 * ...
		 * j[9] = (int)(Math.random() * 100) + 1;
		 */
		sum = 0;
		for(int k = 0; k <j.length; k++) {
			System.out.println(j[k]);
			sum += j[k];
		}
		System.out.println(sum);
		
	}

}
