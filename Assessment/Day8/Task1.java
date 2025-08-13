package Day8;
import java.util.Scanner;

public class Task1 {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int w = sc.nextInt(); 
	        int x = sc.nextInt();
	        int y = sc.nextInt(); 

	        int fixedCost = 100;
	        int profit = (w * (x - y)) - fixedCost;

	        System.out.println(profit);
	    }
	}

	   