package Day8;
 
class Dad{                                           //Superclass , Parent class ,Base class , period class
	void property() {
		System.out.println("House,Land,Money");
	}
}
class Son  extends Dad{                             //Sub class , Child Class, Derived class										
	void show()
	{
		System.out.println("Bike");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		 Son obj = new  Son();
		 obj.property();

	}

}
