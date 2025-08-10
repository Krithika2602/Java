package Day3;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        boolean allEngaged = true;

		        for (int i = 0; i < 3; i++) {
		            String input = sc.nextLine().trim().toLowerCase();
		            if (!input.equals("engaged") && !input.equals("disengaged")) {
		                System.out.println("Invalid Input");
		                return;
		            }
		            if (input.equals("disengaged")) {
		                allEngaged = false;
		            }
		        }

		        if (allEngaged) {
		            System.out.println("Initiating Warp Drive!");
		        } else {
		            System.out.println("Hold On! Some Belts are Adrift.");
		        }
		    }
		}
	
