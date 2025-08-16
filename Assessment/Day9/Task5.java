package Day9;
import java.util.Scanner;

public class Task5 {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int num = sc.nextInt();

	       
	        if (num < 0 || num > 9) {
	            System.out.println("Invalid Input");
	            return;
	        }

	        int square = num * num;
	        if (square % 10 == num) {
	            System.out.println("Automorphic Number");
	        } else {
	            System.out.println("Not an Automorphic Number");
	        }
	    }
	}

	   