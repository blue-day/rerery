
public class Ex02 {
	final int first;	// final�� �ʱⰪ�� �����߸� ��
	final int second;	// final ������ ����̸��� ��� �빮�ڷ� ����� �����.
	final String GOODS_PRICE;
	String name;
	// final�� �ʱⰪ�� ���� �������� �����ڸ� ����� ��.
	public Ex02(int first, int second, String GOODS_PRICE) {
		this.first = first;
		this.second = second;
		this.GOODS_PRICE = GOODS_PRICE;
	}
	/* final�� ������ setter�� ���ؼ� ���� ������ �� ����.
	public void setFirst(int first) {
		this.first = first;
	}*/
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public int getFirst() {
		return this.first;
	}
	public int getSecond() {
		return this.second;
	}

}
