package Day6;
import java.util.Scanner;

public class Task10 {

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        int n = sc.nextInt(); 
	        int[] arr = new int[n];
	        
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        
	        int pos = sc.nextInt();
	        
	        System.out.println("Array after deletion is");
	        for (int i = 0; i < n; i++) {
	            if (i != pos - 1) { 
	                System.out.println(arr[i]);
	            }
	        }
	    }
	}
