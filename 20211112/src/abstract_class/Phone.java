package abstract_class;

public abstract class Phone {	// 부모클래스 -> 추상 클래스(abstract 클래스)
	public String owner;
	public Phone(String owner) {
		this.owner = owner;
	}
	public abstract void turnOn();	// 특정 내용이 정의되어있지 않음. 추상적인.-> 추상화
	public abstract void turnOff();	// 

}
