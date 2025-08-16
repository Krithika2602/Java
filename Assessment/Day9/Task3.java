package Day9;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int count = 1;
        for (int i = 1; i <= n * n; i++) {
            System.out.print(count++);
            if (i % n == 0)
                System.out.println(); 
            else
                System.out.print(" "); 
        }
        
       
    }
}
	    
