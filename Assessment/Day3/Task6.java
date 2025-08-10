package Day3;

import java.util.Scanner;

public class Task6 {

	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        float fl = input.nextFloat();
	        float rl = input.nextFloat();
	        float rr = input.nextFloat();
	        float fr = input.nextFloat();

	        if (fl < 33)
	            System.out.println("Front-left : Inflate");
	        else if (fl > 33)
	            System.out.println("Front-left : Deflate");
	        else
	            System.out.println("Front-left : Untouched");

	        if (rl < 33)
	            System.out.println("Rear-left : Inflate");
	        else if (rl > 33)
	            System.out.println("Rear-left : Deflate");
	        else
	            System.out.println("Rear-left : Untouched");

	        if (rr < 33)
	            System.out.println("Rear-right : Inflate");
	        else if (rr > 33)
	            System.out.println("Rear-right : Deflate");
	        else
	            System.out.println("Rear-right : Untouched");

	        if (fr < 33)
	            System.out.println("Front-right : Inflate");
	        else if (fr > 33)
	            System.out.println("Front-right : Deflate");
	        else
	            System.out.println("Front-right : Untouched");

	        input.close();
	    }
	}

