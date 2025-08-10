package Day5;
import java.util.*;
public class Task10 {

	public static void main(String[] args) {
		
	            Scanner sc = new Scanner(System.in);
		        long a = sc.nextLong();
		        long b = sc.nextLong();
		        
		        int carry = 0;
		        int count = 0;

		        while (a > 0 || b > 0) {
		            int sum = (int)(a % 10 + b % 10 + carry);
		            if (sum >= 10) {
		                carry = 1;
		                count++;
		            } else {
		                carry = 0;
		            }
		            a /= 10;
		            b /= 10;
		        }

		        System.out.println(count);
		    }
		}


	
