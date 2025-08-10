package Day5;
import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        int nails = sc.nextInt();
		        String middle = sc.next();
		        
		        int bestFirst = 0;
		        int bestLast = 0;
		        int bestPerNail = -1;
		        
		        for (int first = 9; first >= 0; first--) {
		            if (middle.contains(String.valueOf(first))) continue;
		            for (int last = 9; last >= 0; last--) {
		                if (middle.contains(String.valueOf(last)) || last == first) continue;
		                String fullPriceStr = first + middle + last;
		                int fullPrice = Integer.parseInt(fullPriceStr);
		                int perNail = fullPrice / nails;
		                if (perNail > bestPerNail) {
		                    bestPerNail = perNail;
		                    bestFirst = first;
		                    bestLast = last;
		                }
		            }
		        }
		        System.out.println(bestFirst + " " + bestLast + " " + bestPerNail);
		    }
		}



