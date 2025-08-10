package Day3;

import java.util.Scanner;

public class task {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
        int num = sc.nextInt();
        
        if((num%3 == 0 ) && (num%5 == 0)){
        	System.out.println("BOTH");
        }
        else if (num%3 == 0) {
        	System.out.println("FIZZ");
       
        }
        else if (num%5 == 0 ) {
        	System.out.println("BIZZ");
        }
        else {
        	System.out.println("Nothing is divisible");
        }
        
	}
}