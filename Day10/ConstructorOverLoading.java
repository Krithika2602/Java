package Day10;

class AA{
	int age;
	String name;
	double cgpa;
	int marks;
	
	AA(int age){
		this.age = age;
	}
	
	AA(int age,String name){
		this.age = age;
		this.name = name;
		
	}
	
	AA(int age, String name,double cgpa){
		this.age = age;
		this.name = name;
		this.cgpa = cgpa;
	}
	
	AA(int age, String name,double cgpa,int marks){
		this.age = age;
		this.name = name;
		this.cgpa = cgpa;
		this.marks = marks;
	}
	
	public void display() {   //Displaying The Output
		System.out.println(age);
		System.out.println(name);
		System.out.println(cgpa);
		System.out.println(marks);
	}
	
}

public class ConstructorOverLoading {

	public static void main(String[] args) {
		
		 new AA(10).display();
		 System.out.println(" ");
		 
		 new AA(10,"krithi").display();
		 System.out.println(" ");
		 
		 new AA(10,"krithi",9.0).display();
		 System.out.println(" ");
		 
		 new AA(10,"krithi",9.0,99).display();
		
		 

	}

}
