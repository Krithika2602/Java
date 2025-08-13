package Day8;
import java.util.Scanner;

public class Task2 {

	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        double principal = sc.nextDouble(); // X
	        double years = sc.nextDouble();     // Y
	        double rate = sc.nextDouble();      // R

	        double interest = (principal * years * rate) / 100;
	        double totalAmount = principal + interest;
	        double discount = interest * 0.02;
	        double finalSettlement = totalAmount - discount;

	        System.out.printf("%.2f\n", interest);
	        System.out.printf("%.2f\n", totalAmount);
	        System.out.printf("%.2f\n", discount);
	        System.out.printf("%.2f\n", finalSettlement);
	    }
	}
	

	

	  