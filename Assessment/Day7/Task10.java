package Day7;
import java.util.Scanner;
public class Task10 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 
        
        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            int len = word.length();
            
            if (len > 10) {
                
                System.out.println(word.charAt(0) + String.valueOf(len - 2) + word.charAt(len - 1));
            } else {
                System.out.println(word);
            }
        }
    }
}

	    