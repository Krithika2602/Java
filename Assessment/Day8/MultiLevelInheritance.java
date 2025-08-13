package Day8;

class Grandpa{
	void display() {
		System.out.println("VILLA");
	}
}

class Father extends Grandpa{                                    
	void property() {
		System.out.println("House,Land,Money");
	}
}

class child extends Father{                             									
	void show()
	{
		System.out.println("Bike");
	}
}


public class MultiLevelInheritance {

	public static void main(String[] args) {
	Grandpa obj = new Grandpa();
	Father obj1 = new Father();
	obj.display();
	obj1.property();

	}

}
