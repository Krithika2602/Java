package Day4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gokul = sc.nextInt();
        int minor = sc.nextInt();
        int total = sc.nextInt();

        int gokulScore = 0;
        int minorScore = 0;
        int turn = 1;

        while (total > 0) {
            int power = 0;
            if (turn == 1) {
                power = gokul;
            } else {
                power = minor;
            }

            int gcd = 0;
            int min = (power < total) ? power : total;
            for (int i = min; i > 0; i--) {
                if (power % i == 0 && total % i == 0) {
                    gcd = i;
                    break;
                }
            }

            if (turn == 1) {
                gokulScore += gcd;
            } else {
                minorScore += gcd;
            }

            total -= gcd;

            if (turn == 1) {
                turn = 2;
            } else {
                turn = 1;
            }
        }

        if (gokulScore > minorScore) {
            System.out.println("Winner: Gokul");
        } else if (minorScore > gokulScore) {
            System.out.println("Winner: Minor");
        } else {
            System.out.println("It's a draw!");
        }

        sc.close();
    }
}
