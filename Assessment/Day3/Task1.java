package Day3;

import java.util.Scanner;

public class Task1{

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);

		        int x = sc.nextInt();
		        int y = sc.nextInt();
		        double ti = sc.nextDouble();
		        double tj = sc.nextDouble();

		        if (x <= 0 || y <= 0 || x >= 32767 || y >= 32767) {
		            System.out.println("Invalid Input");
		            return;
		        }
		        if (tj >= ti) {
		            System.out.println("Invalid Input");
		            return;
		        }

		        int conferenceTimeMinutes = convertToMinutes(ti);
		        int currentTimeMinutes = convertToMinutes(tj);
		        int timeLeftMinutes = conferenceTimeMinutes - currentTimeMinutes;
		        double travelTimeMinutes = ((double)x / y) * 60;

		        if (travelTimeMinutes <= timeLeftMinutes) {
		            System.out.println("Yes");
		        } else {
		            System.out.println("No");
		        }
		    }

		    public static int convertToMinutes(double time) {
		        int hours = (int) time;
		        int minutes = (int) Math.round((time - hours) * 100);
		        return hours * 60 + minutes;
		    }
		}

	
