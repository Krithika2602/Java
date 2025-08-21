package Day10;

import java.util.Scanner;

public class MaxMinAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<=0) {
			System.out.println("Invalid Input");
			return;
		}
		int arr[] = new int[n];
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
			if(arr[i] <=0) {
				System.out.println("Invalid Input");
				return;
			}
			
		}
		int max = arr[0];
		int min = arr[0];
		for(int i =1;i<n;i++) {
			if(arr[i]>max) {
				max = arr[i];
				
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println(min + " " + max);
		
		}

}
