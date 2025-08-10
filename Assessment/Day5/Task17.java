package Day5;
import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        int n = sc.nextInt();

		        int[] digits = new int[5000]; 
		        digits[0] = 1;
		        int size = 1;

		        for (int i = 2; i <= n; i++) {
		            int carry = 0;
		            for (int j = 0; j < size; j++) {
		                int product = digits[j] * i + carry;
		                digits[j] = product % 10;
		                carry = product / 10;
		            }
		            while (carry > 0) {
		                digits[size] = carry % 10;
		                carry /= 10;
		                size++;
		            }
		        }

		        int sum = 0;
		        for (int i = 0; i < size; i++) {
		            sum += digits[i];
		        }

		        System.out.println(sum);
		    }
		}
