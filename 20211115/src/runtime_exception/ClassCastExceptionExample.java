package runtime_exception;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		Cat cat = new Cat();
		changeDog(cat);
	}
	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) {
			try {
				Cat cat = (Cat) animal;
			}catch(ClassCastException e) {
				System.out.println("입력된 객체가 잘못되었습니다.");
			}
		}
	}

}
class Animal{}	// 앞에 public을 붙이면 안됨.
class Dog extends Animal {}
class Cat extends Animal {}
