package Day9;

interface sum 
{
int max = 100;
void show();


static void display()
{
	System.out.println("Displaying");
}
}
class MyClass implements sum
{
  public void show()
  {
	  System.out.println("Showing");
  }
}
public class InterfaceEx {

	public static void main(String[] args) {  
		sum.display();
		MyClass obj = new MyClass();
		obj.show();
	}

	}


