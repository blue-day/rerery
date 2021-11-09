
public class Ex10 {
	String company;
	String model;
	String color;
	int maxSpeed;
	public Ex10(String company, String model,int maxSpeed) {
	// 생성자 내에서 다른 생성자 실행
		this(company, model);
//		this.company = company;
//		this.model = model;
		this.maxSpeed = maxSpeed; //괄호 없는 this는 멤버필드를 의미함.
	}
	public Ex10(String company, String model,String color) {
		this(company,model); //this()메서드로 생성자 호출
		/*						아래에 이미 적어놓은 생성자가 겹치기 때문에 이렇게 적어도 됨.
		this.company = company;
		this.model = model;
		*/
		this.color = color;
	}
// this()메서드에 불러오는 생성자는 아래에 만들어야 오류가 생기지 않음 (변수선언같은 것들과 반대)
	public Ex10(String company, String model) {//company와 model 변수 초기화
		this.company = company;
		this.model = model;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	

}
