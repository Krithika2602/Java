package Day6;
import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        
		        int n = sc.nextInt();  // 4 8 7 2 6
		      
		        int evenSum = 0;
		        int oddSum = 0;
		        
		        for (int i = 0; i < n; i++) {
		            int num = sc.nextInt();
		            
		            if (num % 2 == 0) {
		                evenSum += num;
		            } else {
		                oddSum += num;
		            }
		        }
		        
		        System.out.println("Victory in the Number Quest Duel!");
		        System.out.println("Sum of even numbers: " + evenSum + ".");
		        System.out.println("Sum of odd numbers: " + oddSum + ".");
		    }
		}


	
