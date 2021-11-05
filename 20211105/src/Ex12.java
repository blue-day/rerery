
public class Ex12 {

	public static void main(String[] args) {
		/* num = 1 : 전역변수(어디서든)
		 * def test():
		 * 		num = 100 : 지역: 블럭변수(자바)
		 * 		print(num)
		 * test()
		 * print(num)
		 */
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			int a = 10;
			// 변수 i, a를 블럭변수라 함 : {}블럭 안에서만 사용가능
		}
		//블럭 밖에서 사용하려고 하면 오류발생
		//System.out.println(i);
		//System.out.println(a);
		int num;
		for (num = 1; num <= 10; num++) {
			System.out.println(num);
			//블럭 밖에 있는 변수 num은 블럭 안에서도 사용가능
		}
	}

}
