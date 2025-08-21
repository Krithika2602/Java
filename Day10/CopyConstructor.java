package Day10;

class CC{
	int id;
	public CC (int id) {
		this.id = id;
	}
	public CC(CC b) {
		this.id = b.id;
	}
	
}

public class CopyConstructor {

	public static void main(String[] args) {
	 CC c = new CC(101);
	 CC c1 = new CC(c);
	 
	 System.out.println(c.id);
	 System.out.println("Copy Constructor");
	 System.out.println(c1.id);

	}

}
