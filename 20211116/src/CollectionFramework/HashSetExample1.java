package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		// 순서에 영향을 받지 않는다. (index 가 존재하지 않는다)
		set.add("이숭무");	
		set.add("이상범");
		set.add("이충무");
		set.add("이길무");	// 같은 값은 저장이 안된다. (set에서만)
		set.add("이길무");
		int size = set.size();
		System.out.println(size);
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			String s = (String)iterator.next();
			System.out.println(s);
		}
		set.remove("이숭무");
		size = set.size();
		System.out.println(size);
		
		for (String s : set) {
			System.out.println(s);
			
		}

	}

}
