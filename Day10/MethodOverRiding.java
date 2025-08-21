package Day10;

class Animal{
	void sound() {
		System.out.println("Animal sound");
		
	}
}

class Dog extends Animal{
	@Override        // Must
	void sound() {
		System.out.println("Dog Bark");
	}
}

class Cat extends Animal{
	@Override  // O should be UpperCase
	void sound() {
		System.out.println("Meow");
	}
}

public class MethodOverRiding {
	public static void main(String args[]) {
		
		Animal a = new Dog();
		a.sound();
		
		a= new Cat(); // a is already declared
		a.sound();
		
	}

}
