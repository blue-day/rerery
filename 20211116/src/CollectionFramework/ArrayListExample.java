package CollectionFramework;
// ctrl + shift + O : import 해줌
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String [] args) {
		// 자바 리스트는 배열의 단점을 보완	: 배열은 크기가 고정되어 있음.
		String str [] = { "나는", "자바", "너무", "좋아요"};
		System.out.println(str.length);	// 배열의 크기는 고정이다.
		str[3] = "참좋아요";
//		str[4] = ".";
//		리스트는 크기가 유동적이다. java에서는 기존배열과 같은 타입만 저장	
		List list = new ArrayList();	// 파이썬의 리스트와 비슷
		list.add("이숭무");
		list.add("이상범");
		list.add(1);	// 오류가 되진 않지만 데이터타입분석을 해야 함.
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		for( int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
//		for (String s: list)	: 타입이 불분명하기 때문에 오류
		for (Object obj : list) {	// Object는 자료형을 구분하지 않고 전부 사용가능한 타입.
			System.out.println(obj);
		}
		int i = 10;
		Object obj1 = 10;
		System.out.println(obj1);
		String st = "이숭무";
		obj1 = "이숭무";
		System.out.println(obj1);
		double f = 10.5;
		obj1 = 10.5;
		System.out.println(obj1);
		/// 중요.
		obj1 = new Calu();
		Calu calu = (Calu)obj1;	// 강제 형변환을 이용해서 사용해야 함.
		calu.setFirst(10);
		System.out.println(calu.getFirst());
		
		
		List<String> list1 = new ArrayList<String>();
		list1.add("이숭무");
		list1.add("이상범");
		list1.add("이장범");
		for (String s : list1) {
			System.out.println(s);
		}
	}
}
