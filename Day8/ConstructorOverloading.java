package Day8;

public class ConstructorOverloading {
    int age;
    String name;

    ConstructorOverloading() {
        System.out.println("Hi");
    }

    ConstructorOverloading(int a, String str) {
        age = a;
        name = str;
    }

    ConstructorOverloading(float b) {
        System.out.println(b);
    }

    void display() {
        System.out.println(age + " " + name);
    }

    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading(19, "Krithi");
        obj1.display();

        ConstructorOverloading obj2 = new ConstructorOverloading(5.5f);
    }
}
