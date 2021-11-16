package StringClass;

public class StringMethod {

	public static void main(String[] args) {
		String ssn = "010624-1230123";	// ssn : �ֹε�Ϲ�ȣ -> �տ� 0�� �ֱ⶧���� ���� ���ڷ� �νĵ��� ����.
		//			  01234567890123							�� �տ� 0�� �ִ´ٸ� ���ڿ��� �����ؾ߸� ����.
		System.out.println(ssn.charAt(7));	//					Ư�����ڰ� �߰��� �����־ ������ ���ڿ�.
		String str = "���� �ڹٰ� �ʹ� ����־��.";
		//			  01  2345 678 90123 45
		System.out.println(str.charAt(10));
		// charAt() : index�� �ش��ϴ� ���ڸ� ������
		char ch = ssn.charAt(7);
		switch(ch) {
		case '1' :System.out.println("����"); break;
		case '2' :System.out.println("����"); break;
		case '3' :System.out.println("����"); break;
		case '4' :System.out.println("����"); break;
		}
		// Method ����
		String str1 = "apple";
		boolean b1 = str1.startsWith("ap");	// �ձ����� ������ �˰� ������.
		System.out.println(b1);
		b1 = str1.startsWith("le");
		System.out.println(b1);
		
		b1 = str1.endsWith("le");	// �������� ������
		System.out.println(b1);
		
		str = new String("java");	// String : WrapperŬ������ ������.
		str1 = new String("java");
		System.out.println(str1 == str);	// false
		System.out.println(str1.equals(str));
		
		str1 = "I like the java";
		//      012345678901234
		System.out.println(str1.indexOf("t"));	// ������ �ε�����ȣ�� �˾ƿ��� ��.
		System.out.println(str1.indexOf("a"));
		System.out.println(str1.lastIndexOf("a"));	// ������ �ε����� �ڿ������� ã��.

		int start = str1.indexOf("t");
		System.out.println(str1.substring(start, start + 8));
		
		System.out.println(str1.length());	// �ڷ����� ũ�⸦ �˾ƿ��� ��. �迭������ ()�� ������ �� �ܿ��� ()�� �־�߸� �Ѵ�.
		int [] ii = new int[5];
		System.out.println(ii.length);
		
		// I�� We��	-> ������ char�̱� ������ ''�� ���� ���� �ڷ����� ����� i�� �ٲٴ� ���� ���������� ����� �Ȱ��� ����.
		System.out.println(str1.replace("I", "We"));
		// I�� You��	: ����ǥ���� �ش��ϴ� ���ڸ� ����
		System.out.println(str1.replaceAll("I", "You"));
		
		str = "A:B:C:D:abcd";	// ���ڿ��� split�ϸ� �迭�� �����.
		String [] str2 = str.split(":");
		System.out.println(str2[1]);
		str = "A B C D abcd";
		str2 = str.split(" ");
		System.out.println(str2[1]);
		
		// slicing : a = "abcdef" : a[1:3] => substring (�ڹٿ����� slicing)
		str1 = "abcdef";
		System.out.println(str1.substring(1,3));	// �����̰̽� ��ȣ�������� ���� ����.
		
		str1 = "abcDEF";
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		
		Integer i = 10;
		str = "10" + i.toString();	// ���ڸ� ���ڷ� ��ȯ
		System.out.println(str);
		
		str1 = "  abc DEF  ";	// strip => trim : �翷�� ���鹮�� ����
		System.out.println(str1.trim());
		
		str = "A:B/C-D,abcd";
		str2 = str.split(":|/|-|,");
		System.out.println(str2[1]);
		
		
		
		
	}

}
