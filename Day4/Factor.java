package Day4;

import java.util.Scanner;

public class Factor{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		
		for( int i=1;i<=num;i++)
		{
			if(num%i==0) { // Factor of input 
				count++;//	count the factor
				
			}
			
		}
		System.out.println(count);
	}

}
