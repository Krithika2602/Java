package Day5;
import java.util.*;

public class Task9 {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        long n = sc.nextLong();
		        long pages = 0, digits = 1, start = 1;

		        while (n > 0) {
		            long end = start * 10 - 1;
		            long count = end - start + 1;
		            long block = count * digits;

		            if (n <= block) {
		                if (n % digits != 0) {
		                    System.out.println("Impossible!");
		                    return;
		                }
		                pages += n / digits;
		                System.out.println(pages);
		                return;
		            }

		            n -= block;
		            pages += count;
		            start *= 10;
		            digits++;
		        }
		    }
		}


