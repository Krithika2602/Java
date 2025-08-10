package Day3;

import java.util.Scanner;

public class Task2{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();            
        int y = sc.nextInt();
        float s = sc.nextFloat();
        float r = sc.nextFloat();
        float l = sc.nextFloat();

        if (s > r && (2 * s) < r) {
            System.out.println("Invalid Input");
            return;
        }

        float soloTotal = x * s;
        float roundTripTotal = y * r;
        float total = soloTotal + roundTripTotal;

        if (l < total) {
            System.out.println("Monthly Pass");
        } else {
            System.out.println("Solo Trail + Roundabout Ride");
        }
	}

}
