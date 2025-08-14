package Day9;

abstract class Bike{ 
	
	abstract void run();
	abstract void play();
}

class Honda extends Bike
{
	void run()
	{
		System.out.println("Vehicle");
	}
	void play()
	{
		System.out.println("Playing");
	}
	
	
}

public class Abstract {

	public static void main(String[] args) {
		Bike obj = new Honda();
		obj.run();
		Honda obj1 = new Honda();
		obj1.play();		

	}

}
