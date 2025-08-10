package Day3;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int total=sc.nextInt();
		int groups=sc.nextInt();
		
		int each=total/groups;
		int left=total%groups;
		
		System.out.println("The number of students in each team is " + each + " and left out is " + left);
	}
}


	
