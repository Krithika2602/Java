package Day7;

import java.util.Scanner;

public class Method {
	public int add(int a ,int b) {
		int sum = a+b;
		return sum;
	}

	public static void main(String[] args) {
	    Method obj = new  Method ();
		Scanner sc  = new Scanner(System.in);
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		int res = obj.add(num, num2);
		System.out.println(res);
		
		
		
		

	}

}
