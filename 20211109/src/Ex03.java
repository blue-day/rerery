
public class Ex03 {
	int first;	// ��� �ʵ�
	int second;
	int result;
	public void setData(int first, int second){
		this.first = first;
	//		����ʵ�	 �Ű�����
		this.second = second;
	}
	public void setFirst(int first) { // set ���� ù���ڴ� �빮�ڷ�
		this.first = first;
	}// setter : ����ʵ忡 ���� �������ٶ�/??
	public void setSecond(int second) {
		this.second = second;
	}
	public int getFirst() {
		return this.first;
	}// getter
	public int getSecond() {
		return this.second;
	}
	public void add() {
		this.result = this.first + this.second;
	}
	public void sub() {
		this.result = this.first - this.second;
	}

}
