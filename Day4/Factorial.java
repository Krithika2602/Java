package Day4;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a integer: ");
        int num = scanner.nextInt();  // 5
        int fact = 1;

        for(int i = 1; i <= num; i++) { // 1<=5;// 2<=5;//
            fact = fact*i;// 1*1=>1// 
        }

        System.out.println(fact);
        
        
    }
}

