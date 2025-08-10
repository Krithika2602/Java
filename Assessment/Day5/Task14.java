package Day5;
import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        int start = sc.nextInt();
		        int end = sc.nextInt();
		        

		        if (start < 2) start = 2;
		        StringBuilder sb = new StringBuilder();

		        for (int i = start; i <= end; i++) {
		            boolean prime = true;
		            for (int j = 2; j * j <= i; j++) {
		                if (i % j == 0) {
		                    prime = false;
		                    break;
		                }
		            }
		            if (prime) {
		                if (sb.length() > 0) sb.append(" ");
		                sb.append(i);
		            }
		        }

		        System.out.println(sb.toString());
		    }
		}
