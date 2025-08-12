package Day7;
import java.util.Scanner;
public class Task6 {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);//hello//level
		        String str = sc.nextLine(); 
		        
		        boolean isPalindrome = true;
		        
		        
		        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
		            if (str.charAt(i) != str.charAt(j)) {
		                isPalindrome = false;
		                break;
		            }
		        }
		        
		        if (isPalindrome) {
		            System.out.println("Palindrome Revelation! The string is a palindrome.");
		        } else {
		            System.out.println("Palindromic Mystery Unsolved! The string is not a palindrome.");
		        }
		    }
		}
