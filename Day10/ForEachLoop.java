package Day10;

public class ForEachLoop {
	
	public static void add(int ...m) { //Like OverLoading Concept // ... It Act Like Array
		for(int n:m){   
			System.out.println(n);
		}
	}

	public static void main(String[] args) {
		
		add(10);
		System.out.println(" ");
		
		add(10,20);
		System.out.println(" ");
		
		add(10,20,30);
		
	}

}
