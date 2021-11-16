package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("이숭무");	// Object
		list.add("이상범");
		list.add("이장범");		// list에서는 같은 값이 저장 가능
		list.add("이장범");
		list.set(3, "이길무");	// 리스트에 있는 값 수정
		for(int i = 0; i < list.size(); i++) {
			String s = (String)list.get(i);
			System.out.println(s);
		}
//		for(int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
		// 오류는 아니지만 Object로 저장한 경우 이렇게 사용하지는 않는다.
//		}	// 무슨타입으로 저장하는지 전제를 깔아야만 사용.
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		for(int i = 0; i <list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		// 리스트에 있는 값을 삭제.
		list1.remove(0);
		System.out.println(list1.size());
		System.out.println("================");
		System.out.println(list1.size());
		for (Object obj : list) {
			String s = (String)obj;
			System.out.println(s);
		}
		list.remove(0);
		System.out.println(list.size());
		list.remove("이상범");
		System.out.println(list.size());
//		list.removeAll(list); -> list.clear()랑 같은 것
		list.clear();
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		list.add("이숭무");
		System.out.println(list.isEmpty());
		// add, remove, size. isEmpthy, removeAll
		
	}

}
