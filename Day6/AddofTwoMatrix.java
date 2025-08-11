package Day6;

import java.util.Scanner;

public class AddofTwoMatrix {

	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);

	        int row = sc.nextInt();
	        int col = sc.nextInt();

	        int arr1[][] = new int[row][col];
	        int arr2[][] = new int[row][col];
	        int sum[][] = new int[row][col];

	        
	        System.out.println("Enter first matrix:");
	        for (int i = 0; i < row; i++) {
	            for (int j = 0; j < col; j++) {
	                arr1[i][j] = sc.nextInt();
	            }
	        }

	      
	        System.out.println("Enter second matrix:");
	        for (int i = 0; i < row; i++) {
	            for (int j = 0; j < col; j++) {
	                arr2[i][j] = sc.nextInt();
	            }
	        }

	        
	        for (int i = 0; i < row; i++) {
	            for (int j = 0; j < col; j++) {
	                sum[i][j] = arr1[i][j] + arr2[i][j];
	            }
	        }

	       
	        System.out.println("Sum of matrices:");
	        for (int i = 0; i < row; i++) {
	            for (int j = 0; j < col; j++) {
	                System.out.print(sum[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}

