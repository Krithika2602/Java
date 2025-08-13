package Day8;

public class staticsMethod {
	
	 int rollno = 55;
	 String name = "Krithi";
	 static String collegename = "Zion";
	 
	 void display(int a , String name) {
			System.out.println( a + " " + name + " " + collegename );
		}
	 
	 public static void show(int a)
	 {
		 staticsMethod .collegename = "Mount Zion";
		 System.out.println(a+ " " + collegename);
	 }

	public static void main(String[] args) {
		staticsMethod.show(55);
		staticsMethod obj = new staticsMethod();
		obj.display(65, "Krithi");
	}
}
