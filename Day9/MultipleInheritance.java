package Day9;

interface Print
{
	void display();
}
interface Copy
{
	void show();
	
}
class Xerox implements Print , Copy
{
	public void display()
	{
		System.out.println("Displaying");
	}
	public void show()
	{
		System.out.println("Showing");
	}
}
public class MultipleInheritance {

	public static void main(String[] args) {
	Xerox obj = new Xerox();
	obj.show();
	obj.display();

	}

}
