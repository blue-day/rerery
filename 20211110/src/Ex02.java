
public class Ex02 {

	public static void main(String[] args) {
		int i1 = 10;
		int i2 = 20;
		int i3 = 30;
		int [] i = new int[3];
		i[0] = 10; // i1 = 10; 대신에 씀
		i[1] = 20;
		i[2] = 30;
		
		Account ac1 = new Account();
		Account ac2 = new Account();
		Account ac3 = new Account();
		
		Account [] accs = new Account[3]; //Account 크기만큼의 배열을 만든다
		accs[0] = new Account("1111","이숭무",100);
		accs[1] = new Account();	// 디펄트 생성자를 사용한다는 의미
		// accs는 Account이기 때문에 바로 값이 대입 되지 않는다
		String [] str = new String[3];
		str[0] = "이숭무";
		str[1] = "이장범";

	}

}
