import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // scanner ���� ctrl+shift+o : ���� ������ import�����°�
//		Account acc = new Account("1111","�̼���",100);
//		Account acc1 = new Account("2222","�̻��",100);
//		Account acc2 = new Account("3333","�����",100);
		int arrayNum = 0;	// �迭�� �����ȣ�� ������ ���� ����
		Account [] accs = new Account[100]; //Account�� �ִ� �迭 ����
		// �迭�� index�� 0������ ����
		
		
		boolean run = true;
		//while(run) {	// true�� ()�ȿ� �ִ� ������ ������ �ѹ��� �����ؾ� �ϱ� ����
		do {	// do ~ while : ������ �ѹ��� ����
			System.out.println("1. ���µ�� | 2. ���� ��� "+"| 3. ���� | 4. ��� | 5. ����");
			System.out.print("���� > ");
			String selecNo = sc.nextLine();	// case �ڿ� ���ڿ� -String ~ nextLine()/���� 1 -  int ~ nextInt()
			switch(selecNo) {				//					�Է°� 1\n			�Է°� 1 (\n �� �Է���ġ�� �����ְ� ���ڸ� ������)
			case "1" : 						// int�� ��� - �ٷ� �Ʒ��� sc.nextLine();�� �Է��ϰ� switch�� ���� // �Է���ġ�� �����ִ� \n���� ���ֱ� ���� ���
				System.out.println("���µ�� �������Դϴ�.");
				System.out.println("���� ��ȣ : ");
				String accountNo = sc.nextLine();
				System.out.println("������ : ");
				String owner = sc.nextLine();
				System.out.println("�ݾ� : ");
				
				int money = sc.nextInt();
				
				accs[arrayNum] = new Account(accountNo,owner,money);	// �ʱⰪ
				arrayNum++;
				System.out.println("���µ���� �Ϸ�Ǿ����ϴ�.\n");
				break;
				
			case "2" : 
				System.out.println("���¸�� �������Դϴ�.");
				System.out.println("���¹�ȣ \t\t ������ \t\t �ݾ�");// \t : tab
				for (int i = 0 ; i < accs.length; i ++) {
					if(accs[i]== null) break;
					System.out.println(accs[i].getAccountNo()+"\t\t"+accs[i].getOwner()+"\t\t"+ accs[i].getBalance());
				}
				System.out.println();
				break;
			case "3" : 
				System.out.println("���� �������Դϴ�.");
				System.out.println("���� ��ȣ : ");
				accountNo = sc.nextLine();
				System.out.println("���ݾ� : ");
				money = Integer.parseInt(sc.nextLine());
				Account acc = null; // ������ ���� ����
				for (int i = 0; i < accs.length; i++) {
					if (accs[i] == null ) break;
					else {
						if(accs[i].getAccountNo().equals(accountNo)) {
							// ���¹�ȣ�� ��ġ�ϴ� Account�� ������ acc�� ����
							acc = accs[i]; // ������ ������ �ʱ�ȭ
							// acc = accs[0], acc = accs[1],...
						}
					}
				}
				int result = acc.getBalance() + money;
				acc.setBalance(result);// ���� ����.
				System.out.println();
				break;
			case "4" : 
				System.out.println("��� �������Դϴ�.");
				System.out.println("���� ��ȣ : ");
				accountNo = sc.nextLine();
				System.out.println("��ݾ� : ");
				money = Integer.parseInt(sc.nextLine());
				acc = null;
				for (int i = 0; i < accs.length; i++) {
					if (accs[i] == null ) break;
					else {
						if(accs[i].getAccountNo().equals(accountNo)) {
							// ���¹�ȣ�� ��ġ�ϴ� Account�� ������ acc�� ����
							acc = accs[i]; // ������ ������ �ʱ�ȭ
							// acc = accs[0], acc = accs[1],...
						}
					}
				}
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

}
