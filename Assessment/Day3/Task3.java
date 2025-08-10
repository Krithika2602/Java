package Day3;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String roll = sc.next();

        if (roll.matches("[47]+")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
		
	}

}
