package CollectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Map �÷���
public class HashMapExample1 {
	
	public static void main(String [] args) {
		// ��ųʸ� dic = {"a" : 1, "b" : 2 } == Map
		// print(dic["a"]) // dic.keys()
	// �÷���  <value>�θ� �̷����
		List <String> list = new ArrayList<String>();
// Map�÷��ǻ��� < Ű, �� >���� �̷����
		Map <String, Integer> map = new HashMap <String, Integer>();
		// ��ü ����
		map.put("�̼���", 35);
		map.put("���ֿ�", 85);
		map.put("������", 90);
		map.put("ȫ�浿", 80);
		map.put("ȫ�浿", 95);	// �ߺ� Ű�� ������� ����.
		System.out.println("map�� ũ��� "+ map.size());
		System.out.println("�̼����� ���̴� "+ map.get("�̼���")+ "�� �Դϴ�.");
		
		map.put("�̼���", 16);	// Ű�� ���� ������ �� �ִ�.
								// �߰�, ���� ��� put�� �̿��Ѵ�.
		
		Set<String> keySet = map.keySet();	// Ű�� �����ϸ� Set�ڷ������� �������� ������ Set�ڷ��� �̿�.
		for (String key : keySet) {
			System.out.println(map.get(key));
			System.out.println(key + "�� ���̴� "+ map.get(key)+ "�� �Դϴ�.");
			
		}
		
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(map.get(key));
		}
		System.out.println("===================");
		map.remove("ȫ�浿");
		System.out.println(map.size());
		
		map.clear();
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		
		
	
	}
}
