package Day8;

public class Class {
	
	String hotelname;
	String food;
	int price;

	public static void main(String[] args) {
		
		Class obj = new Class();
		System.out.println(obj.hotelname);
		
		Class obj1 = new Class();
		System.out.println(obj1.food);
		
		Class obj2 = new Class();
		System.out.println(obj2.price);
		
		obj.hotelname = "Maran";
		obj1.food = "Parotta";
		obj2.price = 20;
		System.out.println(obj.hotelname);
		System.out.println(obj1.food);
		System.out.println(obj2.price);
		
		
	}

}
