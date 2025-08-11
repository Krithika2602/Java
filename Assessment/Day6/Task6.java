package Day6;
import java.util.Scanner;

public class Task6 { 
	
        public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        int n = sc.nextInt(); //7 4 6 10 12 14 18 20  //4 2 3 6 8 
		        int sum = 0;

		        for (int i = 0; i < n; i++) {
		            int num = sc.nextInt();
		            if (num % 2 == 0) {
		                sum += num;
		            }
		        }
                if (sum > 0) {
		            System.out.println("Pappu, the Diary Milk is yours! The sum of even numbers in the array is " + sum + ".");
		        } else {
		            System.out.println("Sorry Pappu, no Diary Milk this time. There are no even numbers in the array.");
		        }
		    }
		}


	
