
public class Ex12 {

	public static void main(String[] args) {
		// if ~ else
		int money = 3000;
		if (money >= 3000) {//true
			if (money > 3000) {
				System.out.println("차를 타고 가시오.");
			}else {// false
				System.out.println("걸어가시오.");
			}
			/*if money >= 3000:
			 * 		print("차를 타고 가시오")
			 * else:
			 * 		print("걸어가시오.")
			 */
			char gender = 'M';
			if (gender == 'M')
				System.out.println("남자입니다.");
			else
				System.out.println("여자입니다.");
			//명령문이 각각 한개씩이므로 중괄호 없어도 실행되지만 숙달을 위해 {}를 적자
			
			int score = 57;
			if (score >= 60) {
				System.out.println("합격");
			}else {
				System.out.println("불합격");
			}
		

	}

}
}