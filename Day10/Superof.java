package Day10;

class Vehicle{
	
	int model;
	
	Vehicle(){
		System.out.println("Vehicle Constructor");
	}
	Vehicle(int model){
		this.model = model;
	}
}

class Car extends Vehicle{
	Car(){
	 super();
	}
}

class Bike extends Vehicle{
	Bike(int model){
		super(10);
		this.model = model;
	}
}

public class Superof {

	public static void main(String[] args) {
		new Car();
		new Bike(202);

	}

}
