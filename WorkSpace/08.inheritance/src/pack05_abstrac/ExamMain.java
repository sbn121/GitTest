package pack05_abstrac;

public class ExamMain {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog(null);
		cat.sound();
		dog.sound();
		System.out.println("====ǥ�⼱====");
		Animal animal = new Cat();
		animal.sound();
		animal = new Dog(null);
		animal.sound();
		
	}
}
