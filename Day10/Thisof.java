package Day10;

class BB{  // Current Class constructor call 
	int age;
	String name;
	double cgpa;
	int marks;
	
	BB(int age){
		this.age = age;
	}
	
	BB(int age,String name){
		this(age);
		this.name = name;
		
	}
	
	BB(int age, String name,double cgpa){
		this(age,name);
		this.cgpa = cgpa;
		
	}
	
	BB(int age, String name,double cgpa,int marks){
		this(age,name,cgpa);
		this.marks = marks;
	}
	
	public void display() {   //Displaying The Output
		System.out.println(age);
		System.out.println(name);
		System.out.println(cgpa);
		System.out.println(marks);
	}
	
}
public class Thisof {

	public static void main(String[] args) {
		 new BB(10).display();
		 System.out.println(" ");
		 
		 new BB(10,"krithi").display();
		 System.out.println(" ");
		 
		 new BB(10,"krithi",9.0).display();
		 System.out.println(" ");
		 
		 new BB(10,"krithi",9.0,99).display();
		

	}

}
