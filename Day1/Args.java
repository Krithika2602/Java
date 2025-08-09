package Day1;

public class Args {

    public static void main(String[] Kri) {
        if (Kri.length > 2) {
            System.out.println("The third argument is: " + Kri[2]);
        } else {
            System.out.println("Please provide at least 3 arguments.");
        }
    }
}
