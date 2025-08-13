package Day8;
import java.util.Scanner;

public class Task3 {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int length = sc.nextInt();
	        int breadth = sc.nextInt();

	        int ropeLength = 2 * (length + breadth);
	        int carpetArea = length * breadth;

	        System.out.println(ropeLength);
	        System.out.println(carpetArea);
	    }
	}


	   