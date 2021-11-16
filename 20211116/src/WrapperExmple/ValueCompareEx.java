package WrapperExmple;

public class ValueCompareEx {

	public static void main(String[] args) {
		int i1 = 10;
		int i2 = 10;
		if (i1 == i2) {
			System.out.println("����");
		}
		Integer i3 = 10;
		Integer i4 = 10;
		if(i3 == i4) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		// unboxing
		if(i3.intValue() == i4.intValue()) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		i3 = 10;
		i4 = 10;	// -128 ~ 127
		System.out.println(i3 == i4);	// true
		System.out.println(i3.intValue() == i4.intValue());
		System.out.println(i3.equals(i4));
		i3 = 300;
		i4 = 300;	// -128 > x , 127 < x �϶��� Ÿ���� �����ʾ� ==���� ������������ false�� ����.
		System.out.println(i3 == i4);	// false => ������ �����񱳶� �������� ����.
		System.out.println(i3.intValue() == i4.intValue());
		System.out.println(i3.equals(i4));
	}

}