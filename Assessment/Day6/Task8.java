package Day6;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
	
		        Scanner sc = new Scanner(System.in);
		        
		        int n = sc.nextInt(); //2 2 4 1 3
		        
		        int[] harmony = new int[n]; //6 5 4 3 2 1 -1 5 4 3 2 1 -1
		        
		        int[] melody = new int[n];
		        
		        for (int i = 0; i < n; i++) {
		            harmony[i] = sc.nextInt();
		        }
		        
		        for (int i = 0; i < n; i++) {
		            melody[i] = sc.nextInt();
		        }
		        
		        boolean match = true;
		        for (int i = 0; i < n; i++) {
		            if (harmony[i] != melody[i]) {
		                match = false;
		                break;
		            }
		        }
		        
		        if (match) {
		            System.out.println("Match Found!");
		        } else {
		            System.out.println("No Match Found!");
		        }
		    }
		}

