package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {

	public static void main(String[] args) {
	//	자료형 변수명 =  
		List list = new ArrayList();
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		for(int i = 0; i < list.size(); i++) {
			Board s = (Board)list.get(i);
			System.out.println(s.getContent());
		}
		list.add(1,new Board("제목5", "내용5", "글쓴이5"));	// 원하는 위치에 원하는 데이터 삽입
		for(int i = 0; i < list.size(); i++) {
			Board s = (Board)list.get(i);
			System.out.println(s.getContent());
		}
		System.out.println("====================");
		// 형변환이 귀찮다면.
		//  <> 제너릭 타입 : 이게 없다면 강제형변환을 나중에 추가로 시켜줘야 함
		List<Board> list1 = new ArrayList();
		list1.add(new Board("제목1", "내용1", "글쓴이1"));
		list1.add(new Board("제목2", "내용2", "글쓴이2"));
		list1.add(new Board("제목3", "내용3", "글쓴이3"));
		list1.add(new Board("제목4", "내용4", "글쓴이4"));
		for(int i = 0; i < list1.size(); i++) {
			Board s = list1.get(i);
			System.out.println(s.getContent());
			System.out.println(list1.get(i).getContent());
		}

	}

}
