package runtime_exception;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		Point1 point = null; // Point point = new Point();
		try {
			point.print();
			//System.out.println("���α׷��� ���������� ���� ���Դϴ�.");
		}catch(NullPointerException e) {
			point = new Point1();
			point.print();
			//System.out.println("���α׷��� ���������� ���� ���Դϴ�.");
		}finally {
			System.out.println("���α׷��� ���������� ���� ���Դϴ�.");//try�� catch�� �����ڵ� : finally{}
		}
	}

}
class Point1{
	public void print() {
		System.out.println("���");
	}
}