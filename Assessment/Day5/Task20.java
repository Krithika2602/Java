package Day5;
import java.util.Scanner;
public class Task20 {

	public static void main(String[] args) {
		
                Scanner sc = new Scanner(System.in);
		        int n = sc.nextInt();
		        int count = 0;
		        int num = 2;

		        System.out.println("First " + n + " palindromic prime numbers:");

		        while (count < n) {
		            int rev = 0, temp = num;
		            while (temp > 0) {
		                rev = rev * 10 + temp % 10;
		                temp /= 10;
		            }

		            if (rev == num) { 
		                boolean prime = true;
		                if (num < 2) prime = false;
		                else {
		                    for (int i = 2; i * i <= num; i++) {
		                        if (num % i == 0) {
		                            prime = false;
		                            break;
		                        }
		                    }
		                }

		                if (prime) {
		                    System.out.println(num);
		                    count++;
		                }
		            }
		            num++;
		        }
		    }
		}

