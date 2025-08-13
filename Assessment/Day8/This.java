package Day8;

public class This{
	int age ;
	String name;
	This(int age,String name)
	{
		this.age = age;
		this.name = name;
	}
	void display()
	{
		System.out.println(age + " "+ name);
	}

	public static void main(String[] args) {
		
		This  obj = new This(19, "Krithi");
		
		 obj.display();
		

	}

}
