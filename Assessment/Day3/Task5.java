package Day3;
import java.util.Scanner;
public class Task5 {
     public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int w = scanner.nextInt();

	        if (w < 1 || w > 100) {
	            System.out.println("Invalid Input");
	        } else if (w == 2 || w % 2 != 0) {
	            System.out.println("NO");
	        } else {
	            int part = w / 2;
	            System.out.println("YES");
	            System.out.println(part + " " + part);
	        }
	    }
	}
