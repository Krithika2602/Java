package Day5;
import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
		        int n = sc.nextInt();

		        for (int num = 2; num <= n; num++) {
		            int sum = 1; 
		            for (int i = 2; i * i <= num; i++) {
		                if (num % i == 0) {
		                    sum += i;
		                    if (i != num / i) sum += num / i; 
		                }
		            }
		            if (sum == num && num != 1) {
		                System.out.print(num + " ");
		            }
		        }
		    }
		}


	
