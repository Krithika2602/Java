package Day4;
import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        
        if(num == 0 || num == 1 ) {
        	System.out.println("Not A Prime");
        }
        else {
        	for(int i =2; i<= num; i++)
        	{
        		if(num%i ==0) {
        			count++;
        		}
        		if(count==1) {
        			System.out.println("Prime");
        		}
        	}
        }
    }
}
