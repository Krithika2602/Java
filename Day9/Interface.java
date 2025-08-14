package Day9;

interface Animal{
	void sound();
	default void run() {
		System.out.println("Running");
	
	}
	static void Eat()
	{
		System.out.println("Eating");
	}
	
}
class dog implements Animal
{
	public void sound()
	{
	System.out.println("Barking");
	}
	

}
public class Interface {

	public static void main(String[] args) {
     dog obj = new dog();
     obj.sound();
     Animal obj1 = new dog();
     obj1.run();
    
     }

}
