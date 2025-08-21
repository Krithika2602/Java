package Day10;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int orgn = n;
		int count = 0;
		int sum = 0;
		
		while(n!=0) {
			n/=10;
			count++;
		}
		
		n = orgn;
		
		while(n!=0)
		{
			int rem = n%10;
			int mul = 1;
			for(int i = 0;i<count;i++) {
				mul*=rem;
			}
			sum+=mul;
			n/=10;
		}
		
		if(orgn==sum) {
			System.out.println("Armstrong number");
		}
		
		else {
			System.out.println("Not an Armstrong number");
		}
	}

}

