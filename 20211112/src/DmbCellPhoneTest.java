
public class DmbCellPhoneTest {

	public static void main(String[] args) {
		DmbCellPhone ex = new DmbCellPhone("자기폰", "검정", 5);
		/// 부모로부터 상속받은 메서드 사용
		ex.powerOn();
		ex.bell();
		ex.sendVoice("여보세요.");
		ex.receiveVoice("이숭무 폰 맞나요?");
		ex.sendVoice("아닌데요.");
		ex.hangUp();
		
		// 자식 클래스의 메서드 실행
		ex.turnOnDmb();
		ex.changeChannelDmb(12);
		ex.turnOffDmb();

	}

}
