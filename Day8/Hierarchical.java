package Day8;

class Dad{                                           
	void property() {
		System.out.println("House,Land,Money");
	}
}

class Son  extends Dad{                             										
	void show()
	{
		System.out.println("Bike");
	}
}

class Daughter extends Dad{                             										
		void display()
		{
			System.out.println("Jewel");
		}
}
     public class Hierarchical {
	
          public static void main(String[] args) 
      {
	            Daughter obj = new Daughter();
	            obj.property();
	
      }
}

	
	

