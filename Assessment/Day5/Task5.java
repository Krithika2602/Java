package Day5;

import java.util.Scanner;

public class Task5 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int length = sc.nextInt();
	        int breadth = sc.nextInt();
	        
	        int ropeLength = 2 * (length + breadth);
	        int carpetQuantity = length * breadth;
	        
	        System.out.println("Rope Length: " + ropeLength + "m");
	        System.out.println("Carpet Quantity: " + carpetQuantity + "sqm");
	    }
	}
