package Day5;
import java.util.Scanner;
public class Task19 {

	public static void main(String[] args) {
		
                Scanner sc = new Scanner(System.in);
		        int n = sc.nextInt();
		        int original = n;
		        int sum = 0;

		        while (n > 0) {
		            int d = n % 10;
		            int fact = 1;
		            for (int i = 1; i <= d; i++) {
		                fact = fact * i;
		            }
		            sum = sum + fact;
		            n = n / 10;
		        }

		        if (sum == original) {
		            System.out.println(original + " is a strong number.");
		        } else {
		            System.out.println(original + " is not a strong number.");
		        }
		    }
		}


