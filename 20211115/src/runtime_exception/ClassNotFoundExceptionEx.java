package runtime_exception;

import java.util.HashMap;

public class ClassNotFoundExceptionEx {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.util.List");	// Ŭ���� �񱳿� Ŭ������ �������� ���� �� �ֱ� ������ ������ ���� ó���� ����޶�� ����.
			System.out.println("Ŭ������ �ֽ��ϴ�.");
		}catch(ClassNotFoundException e) {
			System.out.println("Ŭ������ �����ϴ�.");
		}
		/*catch(ClassNotFoundException e) {
			e.printStackTrace(); : �����޼����� ����϶�� �ǹ�
		} // ������ ���� ���α׷����ᰡ �Ǵ� �� �ƴ϶� �����ڰ� ������ Ȯ���ϱ� ���� �ڵ�.
			������ ���α׷� �����.
		*/
	}

}
