package Day6;

import java.util.Scanner;

public class Task9 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        int n = sc.nextInt();  
	        int sum = 0;
	        
	      
	        for (int i = 0; i < n; i++) {
	            sum += sc.nextInt();
	        }
	        
	        
	        double mean = (double) sum / n;
	        
	        
	        System.out.println("Quantum Mean Calculation Completed:");
	        System.out.printf("The quantum mean of the array is %.2f\n", mean);
	        System.out.println("Congratulations, Quantum Explorer!");
	    }
	}
