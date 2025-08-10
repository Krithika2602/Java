package Day4;

import java.util.Scanner;

public class ReverseTheDigits {
	
    public static void main(String args[]) {
    	
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int reverse = 0;

        while (num > 0) {  //429 //42 //92
            int temp = num % 10;     //429%10=>9   //42%10=>2  c//92%10=>2
            reverse = reverse * 10 + temp;  //0*10=>0+9=>9  //9*10+2=>92  //92*10+2=>924
            num = num / 10;        //42     //92   //924
        }
            num =reverse;
            
        System.out.println(num);
        
   }
}


