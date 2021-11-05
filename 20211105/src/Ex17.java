
public class Ex17 {

	public static void main(String[] args) {
		// 1부터 100까지 짝수의 합을 구하시오
		int sum = 0;
		for(int i = 1; i <=100; i ++) {
			if(i %2 != 0)continue;
			sum += i;
		}
		System.out.println(sum);
		System.out.println("===============");
		sum = 0;
		int i = 0;
		while (i <= 99) {
			i++;
			if(i % 2 != 0)continue;
			sum += i;
		}
		System.out.println(sum);
		System.out.println("===============");
		sum = 0;
		i = 0;
		while (true) {
			i++;
			if(i%2 != 0) continue;
			if(i>100)break;
			sum += i;
		}
		System.out.println(sum);

	}

}
