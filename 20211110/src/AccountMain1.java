import java.util.Scanner;

public class AccountMain1 {
	static Account [] accs = new Account[100];
	static Scanner sc = new Scanner(System.in);
	static int arrayNum = 0;	// 배열의 현재번호를 가지기 위한 변수
	static boolean run = true;
	// static 메인 메서드에 사용하기 위해서 변수에는 static을 붙여야 한다.
	// static : 
	public static void main(String[] args) {
//		Account acc = new Account("1111","이숭무",100);
//		Account acc1 = new Account("2222","이상범",100);
//		Account acc2 = new Account("3333","이장범",100);
		
		do {
			System.out.println("1. 계좌등록 | 2. 계좌 목록 "+"| 3. 예금 | 4. 출금 | 5. 종료");
			System.out.print("선택 > ");
			String selecNo = sc.nextLine();	
			switch(selecNo) {
			case "1" :
				System.out.println("계좌등록 페이지입니다.");
				System.out.println("계좌 번호 : ");
				String accountNo = sc.nextLine();
				System.out.println("예금주 : ");
				String owner = sc.nextLine();
				System.out.println("금액 : ");
				
				int money = sc.nextInt();
				
				accs[arrayNum] = new Account(accountNo,owner,money);
				arrayNum++;
				System.out.println("계좌등록이 완료되었습니다.\n");
				break;
				
			case "2" : 
				System.out.println("계좌목록 페이지입니다.");
				System.out.println("계좌번호 \t\t 계좌주 \t\t 금액");
				
				accountPrint();
				
				System.out.println();
				break;
			case "3" : 
				System.out.println("예금 페이지입니다.");
				System.out.println("계좌 번호 : ");
				accountNo = sc.nextLine();
				System.out.println("예금액 : ");
				money = Integer.parseInt(sc.nextLine());
				
				Account acc = accountFind(accountNo);
				
				int result = acc.getBalance() + money;
				acc.setBalance(result);
				System.out.println();
				break;
			case "4" : 
				System.out.println("출금 페이지입니다.");
				System.out.println("계좌 번호 : ");
				accountNo = sc.nextLine();
				System.out.println("출금액 : ");
				money = Integer.parseInt(sc.nextLine());
				acc = accountFind(accountNo);
					
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
	public static Account accountFind(String accountNo) {
		for (int i = 0; i < accs.length; i++) {
			if (accs[i] == null ) break;
			else {
				if(accs[i].getAccountNo().equals(accountNo)) {
					return accs[i];
				}
			}
		}
		return null;
	}
	public static void accountPrint() {
		for (int i = 0 ; i < accs.length; i ++) {
			if(accs[i]== null) break;
			System.out.println(accs[i].getAccountNo()+"\t\t"+accs[i].getOwner()+"\t\t"+ accs[i].getBalance());
		}
		System.out.println();
	}

}


