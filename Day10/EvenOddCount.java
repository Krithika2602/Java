package Day10;

import java.util.Scanner;

public class EvenOddCount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int odd = 0,even = 0;
		int arr[] = new int[n];
		
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
			
		}
		
		for(int i = 0;i<n;i++) {
			
			if(arr[i]%2 == 0) {
				even++;
			}
			
			else {
				odd++;
	        }
		}
		
		System.out.println("Odd:" +odd);
		System.out.println("Even:" +even);
	}

}
