package Day5;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		
		        
		        Scanner sc = new Scanner(System.in);
		        String signal = sc.nextLine();
		        
		        if(signal.equals("red")) {
		            System.out.println("Stop");
		        } else if(signal.equals("green")) {
		            System.out.println("Go");
		        } else if(signal.equals("yellow")) {
		            System.out.println("Get Ready");
		        } else {
		            System.out.println("Invalid Input");
		        }
		       
	}
}
