package Day8;

public class staticsBlocks {
	
	static {
		System.out.println("Mount Zion");  //static block will execute first and then move to main method.
	}

	public static void main(String[] args) {
		System.out.println("Nice To Meet You");

	}

}
