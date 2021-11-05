
public class Ex13 {

	public static void main(String[] args) {
		//5단 출력
		for (int i = 1; i <= 9; i++) {
			System.out.println("5 *"+ i +" = " + 5*i);
		}
		//6단 출력
		for (int i = 1; i <= 9; i++) {
			System.out.println("6 *"+ i +" = " + 6*i);
		}
		for (int i = 1; i <= 9; i++) {
			System.out.println("7 *"+ i +" = " + 7*i);
		}
		System.out.println("============");
		for(int dan = 5; dan <= 7; dan++) {
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan+ " * "+ i +" = " + dan*i);
			}
		}
	}

}
