
public class Car2 {
	String model;
	String color;
	int maxSpeed;
	
	public Car2(String model) {
		this(model,"흰색",250);
//		this.model = model;
//		this.color = "흰색";
//		this.maxSpeed = 250;
	}
	public Car2(String model,String color) {
		this(model,color,230);
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = 230;
	}
	// 생성자 한개로 전부 적용 가능
	public Car2(String model,String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	

}
