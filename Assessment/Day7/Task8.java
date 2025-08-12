package Day7;
import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32); // lowercase → uppercase
            } else if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32); // uppercase → lowercase
            }
            res = res + ch;
        }
        System.out.println("Case Cascade Magic Unleashed! The " + res + " transformation is complete.");
    }
}

	
