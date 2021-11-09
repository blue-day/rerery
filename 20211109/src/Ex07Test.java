
public class Ex07Test {

	public static void main(String[] args) {
		// Ex07 ex07 = new 생성자(클래스명이 아닌 생성자를 지칭함)
		Ex07 ex07 = new Ex07(20, 10);	// 생성자를 실행.
		ex07.add();
		System.out.println(ex07.getResult());
		
		Ex07 ex071 = new Ex07();		// 디폴트 생성자 실행
		ex071.setFirst(100);
		ex071.setSecond(50);
		
		Ex071 ex007 = new Ex071();		// 디폴트 생성자 실행
		ex007.setFirst(30);
		System.out.println(ex007.getFirst());

	}

}

