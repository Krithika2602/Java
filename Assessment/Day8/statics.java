package Day8;

public class statics {
	int rollno = 26;
	String name = "Krithi";
	static String collegename = "zion";
	
	void display(int a , String name) {
		System.out.println( a + " " + name + " " + collegename );
	}
	public static void main(String args[]) {
		statics obj = new statics();
		System.out.println(obj.rollno);
		System.out.println(statics.collegename);
		obj.display(26, "Krithi");
		obj.display(27, "Ashwin");
		obj.display(26, "Arjun");
		obj.display(26, "Akash");
	}
}
