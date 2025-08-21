package Day10;
//ENcapsulation : Hiding the Data
class Person{
	
	private String name;
	
	public void setName(String name) {
		this.name= name;
	}
	
	public String getName() {
		return name;
	}
}

public class EncapsulationEX {

	public static void main(String[] args) {
		
		Person p =new Person();
		p.setName("Krithi");
		System.out.println(p.getName());
		
	}

}
