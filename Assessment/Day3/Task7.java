package Day3;
import java.util.Scanner;
public class Task7 {
	

       public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String color = sc.nextLine();

	        if (color.equals("BLUE")) {
	            System.out.println("The Chromatic Horizon whispers: It is Dawn");
	        } else if (color.equals("RED")) {
	            System.out.println("The Chromatic Horizon reveals: It is Dusk");
	        } else {
	            System.out.println("The Chromatic Riddle unfolds: Invalid Input");
	        }
       }
}
	

	