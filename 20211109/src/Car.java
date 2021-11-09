
public class Car {// 생성자,메서드 생성 단축키
	// 자동차의 정보에 대한 클래스 생성
	// 회사, 모델, 색, 스피드
	String company;
	String model;
	String color;
	int maxSpeed;
	public Car() {}
	public Car(String company, String model, String color, int maxSpeed) {
		super();
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}//Alt + Shift + s -> o -> generate
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
	}//Alt + Shift + s -> r -> sellect all
	
	

}
