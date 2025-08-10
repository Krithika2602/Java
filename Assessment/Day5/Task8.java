package Day5;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        int x = sc.nextInt();
		        int y = sc.nextInt();
		        int n = sc.nextInt();
		        
		        int gcdAlaric = gcd(x, n);
		        int gcdSeraphina = gcd(y, n);
		        
		        if (gcdAlaric >= gcdSeraphina) {
		            System.out.println("Alaric unravels the most Mystical Scrolls in the Grand Library!");
		        } else {
		            System.out.println("Seraphina unravels the most Mystical Scrolls in the Grand Library!");
		        }
		       
		    }

		    static int gcd(int a, int b) {
		        while (b != 0) {
		            int temp = b;
		            b = a % b;
		            a = temp;
		        }
		        return a;
		    }
		}


	
