package Day6;
import java.util.Scanner;
public class Task3 {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        
		        int n = sc.nextInt();
		        int[] bob = new int[n];
		        int[] alice = new int[n];
		        
		        for (int i = 0; i < n; i++) {
		            bob[i] = sc.nextInt();
		        }
		        for (int i = 0; i < n; i++) {
		            alice[i] = sc.nextInt();
		        }
		        
		        boolean compatible = true;
		        for (int i = 0; i < n; i++) {
		           if (bob[i] < alice[i]) {
		                compatible = false;
		               
		            }
		        }if (compatible) {
		            System.out.println("Compatibility Achieved!");
		        } else {
		            System.out.println("Incompatibility Detected!");
		        }
		    }
		}


	
