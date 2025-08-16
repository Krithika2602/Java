package Day9;
import java.util.Scanner;

public class Task2 {

	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();

	        int term = 2, diff = 2;

	        for (int i = 1; i <= n; i++) {
	            System.out.print(term);
	            if (i < n)
	            	System.out.print(" ");
	            term += diff;
	            diff = diff * 2 - 1;  
	        }

	       
	    }
	}

	
	  
