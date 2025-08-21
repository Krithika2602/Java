package Day10;

public class MethodOverLoading {
	
	public static int add(int a ,int b) {
		return a+b;
	}
	
	public static int add(int a ,int b , int c) {
		return a+b+c;
	}
	
	public static double add(double a ,double b ,double c,double d) {
		return a+b+c+d;
	}
	
	public static float add(float c,float d) {
		return c+d;
	}
	
	public static void main(String[] args) {
		
    System.out.println(add(10,20));
    System.out.println(add(10,20,30));
    System.out.println(add(10.0 , 20.0, 30.0, 40.0));
    System.out.println(add(3,3));

	}

}
