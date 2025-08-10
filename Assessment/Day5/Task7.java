package Day5;

import java.util.Scanner;

public class Task7 {

		 public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        int n = sc.nextInt();
		        int a = sc.nextInt();
		        int b = sc.nextInt();
		        
		        int result = n - a - b;
		        if (result < 0) {
		        	result = 0;
		        }
		        System.out.println(result);
		        
		        
		    }
		}


	

