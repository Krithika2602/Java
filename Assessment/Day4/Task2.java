package Day4;

import java.util.Scanner;

public class Task2 {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int num = sc.nextInt();
	        
	        int original = num;
	        int result = 0;

	        while (num > 0) {
	            int digit = num % 10;
	            result += digit * digit * digit;
	            num /= 10;
	        }

	        if (original == result) {
	            System.out.println("Armstrong number");
	        } else {
	            System.out.println("Not an Armstrong number");
	        }

	        
	    }
}
	
