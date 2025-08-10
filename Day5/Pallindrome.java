package Day5;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        int num = sc.nextInt();
		        int original = num;
		        int reverse = 0;

		        while (num > 0) {
		            int digit = num % 10;
		            reverse = reverse * 10 + digit;
		            num /= 10;
		        }

		        if (original == reverse) {
		            System.out.println("Palindrome");
		        } else {
		            System.out.println("Not a Palindrome");
		        }

		        
		    }
		}


	
