
public class EX11 {

	public static void main(String[] args) {
		/* if 조건식:
		 * 		명령어1
		 * 		명령어2
		 * 		...
		 */
		/*if(조건식){
		 * 		명령어1; /들여쓰기를 하지 않아도 오류는 아니지만 가독성을 위해 들여쓰기함
		 * 		명령어2;
		 * 		...
		 * }
		 */
		int i = 10;
		if (i < 20) System.out.println("작다");//명령어가 하나라면 중괄호 필요없음
		if (i > 20) {
			System.out.println("i는 ");
			System.out.println("10보다 작다");
			System.out.println("...");
		}
		int money = 3000;
		//돈이 3000원을 초과하면 차를 타고 가시오.
		if (money > 3000)
			System.out.println("차를 타고 가시오");//들여쓰기랑 상관없이 첫줄만 if문에 종속됨
			System.out.println("if문이 종료되었습니다.");
		if (money > 3000) {
			System.out.println("차를 타고 가시오");
		}
		System.out.println("if문이 종료되었습니다.");
		if (money > 3000)
			System.out.println("차를 타고 가시오");
			
		System.out.println("if문이 종료되었습니다.");
	}

}
