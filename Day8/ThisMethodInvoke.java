package Day8;

public class ThisMethodInvoke {
	void display()
	{
		System.out.println("Hello display");
	}
	void show()
	{
		this.display();
		System.out.println("Hello show");    
	}

	public static void main(String[] args) {
		ThisMethodInvoke obj = new ThisMethodInvoke();
		obj.show();

	}

}
