package Day7;
import java.util.Scanner;
public class Task7 {

	public static void main(String[] args) {
	
    Scanner sc = new Scanner(System.in); //whimsical//elevate//enchanting//mystical
    String word = sc.nextLine();
		        
		        String result = "";
		        
		        for (int i = 0; i < word.length(); i++) {
		            char ch = word.charAt(i);
		            
		            if (ch >= 'a' && ch <= 'z') {
		                ch = (char)(ch - 32); 
		            }
		            result += ch; 
		        }
		        
		        System.out.println("Word Ascension Achieved! Behold the majestic transformation: " + result + ".");
		    }
		}

	


