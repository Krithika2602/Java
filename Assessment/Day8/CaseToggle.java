package Day8;
import java.util.Scanner;

public class CaseToggle {

	 public static void main(String[] args) {
		 
	        Scanner sc = new Scanner(System.in);  //lowercase->uppercase
	        String s = sc.nextLine();
	        String res = "";
	        
	        for (int i = 0; i < s.length(); i++)
	        {
	            char ch = s.charAt(i);
	            
	            if (ch >= 'a' && ch <= 'z') 
	            {
	                ch = (char)(ch - 32);
	            } 
	            else if (ch >= 'A' && ch <= 'Z')
	            {
	                ch = (char)(ch + 32);
	            }
	            res = res + ch;
	        }
	        System.out.println(res);
	    }
	}
	   
	
