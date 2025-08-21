package Day10;

public class Block {   // Block -(static & Non-static)
	{
		System.out.println("Non-static BLOCK Running"); // Object Creation is Must for Execution // run after obj creation
	}
	
	Block(){ //Constructor will run at last
		 System.out.println("Constructor");
	 }
	 
	static {  // run at 1st
		System.out.println("static BLOCK Running");
	}
	
	static {
		System.out.println("static Block Running - 2");
	}

	public static void main(String[] args) {  //run at 2nd
		 
		System.out.println("Main Start");
		new Block(); // For Non-static Block
		System.out.println("Main End");
		new Block(); // For Non-static Block
		
		{
			System.out.println("Non-static -2");
		}
		
		
	}

}
