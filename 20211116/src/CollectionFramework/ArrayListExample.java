package CollectionFramework;
// ctrl + shift + O : import ����
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String [] args) {
		// �ڹ� ����Ʈ�� �迭�� ������ ����	: �迭�� ũ�Ⱑ �����Ǿ� ����.
		String str [] = { "����", "�ڹ�", "�ʹ�", "���ƿ�"};
		System.out.println(str.length);	// �迭�� ũ��� �����̴�.
		str[3] = "�����ƿ�";
//		str[4] = ".";
//		����Ʈ�� ũ�Ⱑ �������̴�. java������ �����迭�� ���� Ÿ�Ը� ����	
		List list = new ArrayList();	// ���̽��� ����Ʈ�� ���
		list.add("�̼���");
		list.add("�̻��");
		list.add(1);	// ������ ���� ������ ������Ÿ�Ժм��� �ؾ� ��.
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		for( int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
//		for (String s: list)	: Ÿ���� �Һи��ϱ� ������ ����
		for (Object obj : list) {	// Object�� �ڷ����� �������� �ʰ� ���� ��밡���� Ÿ��.
			System.out.println(obj);
		}
		int i = 10;
		Object obj1 = 10;
		System.out.println(obj1);
		String st = "�̼���";
		obj1 = "�̼���";
		System.out.println(obj1);
		double f = 10.5;
		obj1 = 10.5;
		System.out.println(obj1);
		/// �߿�.
		obj1 = new Calu();
		Calu calu = (Calu)obj1;	// ���� ����ȯ�� �̿��ؼ� ����ؾ� ��.
		calu.setFirst(10);
		System.out.println(calu.getFirst());
		
		
		List<String> list1 = new ArrayList<String>();
		list1.add("�̼���");
		list1.add("�̻��");
		list1.add("�����");
		for (String s : list1) {
			System.out.println(s);
		}
	}
}
