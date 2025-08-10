package Day5;
import java.util.Scanner;
public class Task12 {

	public static void main(String[] args) {
		
                Scanner sc = new Scanner(System.in);
		        int start = sc.nextInt();
		        int end = sc.nextInt();
		        
		        for (int i = start; i <= end; i++) {
		            if (i > 1) {
		                boolean prime = true;
		                for (int j = 2; j * j <= i; j++) {
		                    if (i % j == 0) {
		                        prime = false;
		                        
		                    }
		                }
		                if (prime) 
		                	
		                System.out.print(i + " ");
		            }
		        }
		    }
		}


	
