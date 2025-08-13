package Day8;

public class AllStatic {
	static                                    //Static Block
	{
		System.out.println("Mount Zion");
	}

	int rollno = 26;
	String name = "Krithi";
	static String collegename = "zion";
	
	void display(int a , String name) {
		System.out.println( a + " " + name + " " + collegename );
	}
	public static void show(int a)           //Static Method
	 {
	     AllStatic.collegename = "Mount Zion";
		 System.out.println(a+ " " + collegename);
	 }
	public static void main(String args[]) {
		statics obj = new statics();
		AllStatic.show(55);
		
		obj.display(65, "Krithi");
		System.out.println(obj.rollno);
		System.out.println(statics.collegename);
		obj.display(26, "Krithi");
		obj.display(27, "Ashwin");
		obj.display(26, "Arjun");
		obj.display(26, "Akash");
		
	}

}
