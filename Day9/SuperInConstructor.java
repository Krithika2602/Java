package Day9;

class Fruits
{
	Fruits()
	{
		System.out.println("Signing");
	}
} 
class apple extends  Fruits
{
	apple(){
		System.out.println("Bow Bow");
	}
}

public class SuperInConstructor {

	public static void main(String[] args) {
		apple obj = new apple();

	}

}
