package Day6;

import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        int[] ramu = new int[n];
        int[] raju = new int[n];
        int[] fused = new int[n];
        
        for (int i = 0; i < n; i++) {
            ramu[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            raju[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            fused[i] = ramu[i] + raju[i];
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(fused[i] + (i < n - 1 ? " " : ""));
        }
    }
}



