package Day8;

public class Trip {
    String place;
    String place2;
    String transport;
    String Food;
    String Visit;
    int cost;
   
    public static void main(String[] args) {
        
        Trip obj = new Trip();
        System.out.println(obj.place);
        
        Trip obj1 = new Trip();
        System.out.println(obj1.place2);
        
        Trip obj2 = new Trip();
        System.out.println(obj1.transport);
        
        Trip obj3 = new Trip();
        System.out.println(obj2.cost);
        
        Trip obj4 = new Trip();
        System.out.println(obj.Food);
        
        Trip obj5 = new Trip();
        System.out.println(obj4.Visit);
        
        
        
        obj.place = "Ooty";
        obj1.place2 = "Tea estate";
        obj2.transport = "Car";
        obj3.cost = 1500;
        obj4.Food = "Temple City";
        obj5.Visit = "Guna Cave";
       
        
        System.out.println(obj.place);
        System.out.println(obj1.place2);
        System.out.println(obj2.transport);
        System.out.println(obj3.cost);
        System.out.println(obj4.Food);
        System.out.println(obj5.Visit);
    }
}
