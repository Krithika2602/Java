package Day8;

public class ParameterizedConstructor {
	
	 int age;
	 String name;
	 
	ParameterizedConstructor()
	{
		System.out.println("Hi");
	}
	
	ParameterizedConstructor (int a ,String str)
	{
		age = a;
		name = str;
	}
	
	void display()
	{
		System.out.println(age + " "+ name);
	}
	

	public static void main(String[] args) {
		ParameterizedConstructor obj = new ParameterizedConstructor(19, "Krithi");
		obj.display();
		
	}

}
