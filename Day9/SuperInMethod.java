package Day9;

class Vehicle {
    String type = "Generic Vehicle";

    void start() {
        System.out.println("Vehicle starting...");
    }
}

class Car extends Vehicle {
    String type = "Sports Car";

    void honk() {
        System.out.println("Car honking!");
    }

    void display() {
        super.start(); 
        honk();      
    }
}

public class SuperInMethod {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.display();
    }
}
