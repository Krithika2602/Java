package Day4;

import java.util.Scanner;



public class SumOfDigits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        while (num > 9) {  
        	int sum = 0;
            while (num > 0) {
                int temp = num % 10;  
                sum = sum + temp;
                num = num / 10;       
            }
            num = sum;  
        }

        System.out.println(num);  
        
    }
}


       
   
