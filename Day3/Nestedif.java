package Day3;

import java.util.Scanner;

public class Nestedif {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
        int Weight = sc.nextInt();
        
        if(Weight>=0 && Weight<=100) {
        	System.out.println("VALID");
        	if(Weight %2 == 0) {
        		System.out.println("YES");
        		System.out.println(Weight/2 + " " + Weight/2);
        		
        		
        	}
        	else {
        		System.out.println("NO");
        	}
        }
        
        else {
        	System.out.println("INVALID INPUT");
        }
        
          
	}

}
