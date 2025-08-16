package Day9;
import java.util.Scanner;


public class Task4 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxWeight = sc.nextInt(); 
        int adults = sc.nextInt();    
        int children = sc.nextInt();  

        int totalWeight = (adults * 75) + (children * 30);

        if (totalWeight <= maxWeight) {
            System.out.println("Boat is stable");
        } else {
            System.out.println("Boat will drown");
        }
    }
}

	
