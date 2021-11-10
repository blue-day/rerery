import java.util.Scanner;

public class AccountMain1 {
	static Account [] accs = new Account[100];
	static Scanner sc = new Scanner(System.in);
	static int arrayNum = 0;	// �迭�� �����ȣ�� ������ ���� ����
	static boolean run = true;
	// static ���� �޼��忡 ����ϱ� ���ؼ� �������� static�� �ٿ��� �Ѵ�.
	// static : 
	public static void main(String[] args) {
//		Account acc = new Account("1111","�̼���",100);
//		Account acc1 = new Account("2222","�̻��",100);
//		Account acc2 = new Account("3333","�����",100);
		
		do {
			System.out.println("1. ���µ�� | 2. ���� ��� "+"| 3. ���� | 4. ��� | 5. ����");
			System.out.print("���� > ");
			String selecNo = sc.nextLine();	
			switch(selecNo) {
			case "1" :
				System.out.println("���µ�� �������Դϴ�.");
				System.out.println("���� ��ȣ : ");
				String accountNo = sc.nextLine();
				System.out.println("������ : ");
				String owner = sc.nextLine();
				System.out.println("�ݾ� : ");
				
				int money = sc.nextInt();
				
				accs[arrayNum] = new Account(accountNo,owner,money);
				arrayNum++;
				System.out.println("���µ���� �Ϸ�Ǿ����ϴ�.\n");
				break;
				
			case "2" : 
				System.out.println("���¸�� �������Դϴ�.");
				System.out.println("���¹�ȣ \t\t ������ \t\t �ݾ�");
				
				accountPrint();
				
				System.out.println();
				break;
			case "3" : 
				System.out.println("���� �������Դϴ�.");
				System.out.println("���� ��ȣ : ");
				accountNo = sc.nextLine();
				System.out.println("���ݾ� : ");
				money = Integer.parseInt(sc.nextLine());
				
				Account acc = accountFind(accountNo);
				
				int result = acc.getBalance() + money;
				acc.setBalance(result);
				System.out.println();
				break;
			case "4" : 
				System.out.println("��� �������Դϴ�.");
				System.out.println("���� ��ȣ : ");
				accountNo = sc.nextLine();
				System.out.println("��ݾ� : ");
				money = Integer.parseInt(sc.nextLine());
				acc = accountFind(accountNo);
					
				result = acc.getBalance() - money;
				acc.setBalance(result);// ���� ����.
				System.out.println();
				break;
			case "5" :
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				run = false; break;
				// System.exit(0); // ���α׷� ����
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


