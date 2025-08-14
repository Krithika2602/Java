package Day9;

class Animals
{
	String color = "Red";
	
}
class Bird 
{
	String color = "purple";
	
}
class Dog extends Bird
{
	String color = "White";
	void display()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		Dog obj  = new Dog();
		obj.display();

	}

}
