
public class Ex05Test {

	public static void main(String[] args) {
		Ex05 ex05 = new Ex05();
		/* 직접 멤버에 접근할 수 없다.
		멤버 은닉 : 캡슐화
		ex05.age = 20;
		ex05.Height= 170.5;
		*/
		ex05.setAge(30);
		ex05.setHeight(160.7);
//		System.out.println(ex05.age);
		ex05.name = "이장범";
		System.out.println(ex05.getAge());
		System.out.println(ex05.name);

	}

}
