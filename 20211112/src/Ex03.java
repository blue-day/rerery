
public class Ex03 extends Ex02{	// �ڽ� Ŭ����
	String subject;
	public Ex03(int radius, double pi, String subject) {
		super(radius, pi);
		this.subject = subject;
	}	// ���� �̸��� �޼��忡�� �Ϻθ� �ٲ㼭 ����
	public double area() {	// ������ (�������̵�)
		return radius * radius * Math.PI;
	}
	public double area(double p) {	// �����ε� : �׳� ���� �̸��� �Լ� ����� �ȵ����� ������ �߰��ϸ� ����
		return radius * radius * p;
	}
	public double area1() {
		return super.area();	// super.  : �θ� �Ÿ� ����Ѵ�.
	}

}
