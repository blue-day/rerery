import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // scanner 쓰고 ctrl+shift+o : 빨강 누르고 import누르는거
//		Account acc = new Account("1111","이숭무",100);
//		Account acc1 = new Account("2222","이상범",100);
//		Account acc2 = new Account("3333","이장범",100);
		int arrayNum = 0;	// 배열의 현재번호를 가지기 위한 변수
		Account [] accs = new Account[100]; //Account를 넣는 배열 생성
		// 배열의 index는 0번부터 시작
		
		
		boolean run = true;
		//while(run) {	// true를 ()안에 넣는 이유는 무조건 한번은 실행해야 하기 때문
		do {	// do ~ while : 무조건 한번은 실행
			System.out.println("1. 계좌등록 | 2. 계좌 목록 "+"| 3. 예금 | 4. 출금 | 5. 종료");
			System.out.print("선택 > ");
			String selecNo = sc.nextLine();	// case 뒤에 문자열 -String ~ nextLine()/숫자 1 -  int ~ nextInt()
			switch(selecNo) {				//					입력값 1\n			입력값 1 (\n 는 입력장치에 남아있고 숫자만 가져옴)
			case "1" : 						// int의 경우 - 바로 아래에 sc.nextLine();를 입력하고 switch문 실행 // 입력장치에 남아있는 \n값을 없애기 위해 사용
				System.out.println("계좌등록 페이지입니다.");
				System.out.println("계좌 번호 : ");
				String accountNo = sc.nextLine();
				System.out.println("예금주 : ");
				String owner = sc.nextLine();
				System.out.println("금액 : ");
				
				int money = sc.nextInt();
				
				accs[arrayNum] = new Account(accountNo,owner,money);	// 초기값
				arrayNum++;
				System.out.println("계좌등록이 완료되었습니다.\n");
				break;
				
			case "2" : 
				System.out.println("계좌목록 페이지입니다.");
				System.out.println("계좌번호 \t\t 계좌주 \t\t 금액");// \t : tab
				for (int i = 0 ; i < accs.length; i ++) {
					if(accs[i]== null) break;
					System.out.println(accs[i].getAccountNo()+"\t\t"+accs[i].getOwner()+"\t\t"+ accs[i].getBalance());
				}
				System.out.println();
				break;
			case "3" : 
				System.out.println("예금 페이지입니다.");
				System.out.println("계좌 번호 : ");
				accountNo = sc.nextLine();
				System.out.println("예금액 : ");
				money = Integer.parseInt(sc.nextLine());
				Account acc = null; // 일종의 변수 선언
				for (int i = 0; i < accs.length; i++) {
					if (accs[i] == null ) break;
					else {
						if(accs[i].getAccountNo().equals(accountNo)) {
							// 계좌번호가 일치하는 Account를 가져와 acc에 저장
							acc = accs[i]; // 일종의 변수값 초기화
							// acc = accs[0], acc = accs[1],...
						}
					}
				}
				int result = acc.getBalance() + money;
				acc.setBalance(result);// 값을 저장.
				System.out.println();
				break;
			case "4" : 
				System.out.println("출금 페이지입니다.");
				System.out.println("계좌 번호 : ");
				accountNo = sc.nextLine();
				System.out.println("출금액 : ");
				money = Integer.parseInt(sc.nextLine());
				acc = null;
				for (int i = 0; i < accs.length; i++) {
					if (accs[i] == null ) break;
					else {
						if(accs[i].getAccountNo().equals(accountNo)) {
							// 계좌번호가 일치하는 Account를 가져와 acc에 저장
							acc = accs[i]; // 일종의 변수값 초기화
							// acc = accs[0], acc = accs[1],...
						}
					}
				}
				result = acc.getBalance() - money;
				acc.setBalance(result);// 값을 저장.
				System.out.println();
				break;
			case "5" :
				System.out.println("프로그램이 종료되었습니다.");
				run = false; break;
				// System.exit(0); // 프로그램 종료
			}

		}while(run);
	}

}
