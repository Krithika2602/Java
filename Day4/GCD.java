package Day4;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num2 = sc.nextInt();		
		int gcd = 0;
		int min = (num<num2)?num:num2;
		for(int i = min;i>0;i--)
		{
			if(num %i ==0 && num2%i==0)
			{
				gcd = i;
				break;
			}
		}
		System.out.println(gcd);
	}
}
		