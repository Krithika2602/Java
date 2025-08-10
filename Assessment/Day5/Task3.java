package Day5;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
	        
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int k = sc.nextInt();
	        
	        int perCycle = 2 * n;
	        int cycles = (k + perCycle - 1) / perCycle;
	        System.out.println("The minimum count of n levels is " + cycles);
	        

	}

}
