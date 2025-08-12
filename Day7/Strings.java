package Day7;

public class Strings {

	public static void main(java.lang.String[] args) {
	 String str = "Krithi";
	 String str1 = "Krithi";
	 String str2 = new String("Krithi");
	 String str3 = new String("Dhara");
	 System.out.println(str == str1);
	 System.out.println(str.length());
	 System.out.println(str.substring(2, 4));
	 System.out.println(str3.concat("Amuth"));
	 System.out.println(str2.contains("Krithi"));
	 System.out.println(str2.charAt(0));
	 System.out.println(str3.startsWith("Dh"));
	 System.out.println(str.endsWith("thi"));
	 String word[] = str.split(" ");
	 for(String var:word)
	 {
		 System.out.println(var);
	 }
	 System.out.println(str1.trim().length());
	 System.out.println(str.equals(str1));
	 System.out.println(str.equalsIgnoreCase(str1));
	 System.out.println(str.toUpperCase());
	 System.out.println(str3.toLowerCase());
	 
	 
	 

	}

}
