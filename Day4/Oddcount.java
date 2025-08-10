package Day4;

import java.util.Scanner;

public class Oddcount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Start = sc.nextInt();
		int End = sc.nextInt();
		int evencount = 0;
		for (int i = Start;i<= End ; i++)
		{
			if(i%2!=0) {
				evencount++;
				
			}
			
		}
		System.out.println(evencount);
		

	}

}
