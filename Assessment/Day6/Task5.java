package Day6;

import java.util.Scanner;

public class Task5 {
         public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        int n = sc.nextInt();    //7 3 5 5 7 9 11 11 // 8 5 5 7 8 8 8 11 15 // 4 2 4 4 6 //5 12 12 14 18 18
	       
	        int[] notes = new int[n];
	        
	        for (int i = 0; i < n; i++) {
	            notes[i] = sc.nextInt();
	        }
	        
	        int distinctCount = 0;
	        for (int i = 0; i < n; i++) {
	            boolean isDuplicate = false;
	            for (int j = 0; j < i; j++) {
	                if (notes[i] == notes[j]) {
	                    isDuplicate = true;
	                    break;
	                }
	            }
	            if (!isDuplicate) {
	                distinctCount++;
	            }
	        }
	        
	        System.out.println(distinctCount);
	    }
	}

		
		

	
