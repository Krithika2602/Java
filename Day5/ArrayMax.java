package Day5;

import java.util.Scanner;

public class ArrayMax {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();  //5
        int arr[] = new int[size];  //20 30 40 50 60
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];   //max=>20// max =>30 //max=>40//max=>50
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {  // (30>20) //(40>30)//(50>40)//(60>50)
                max = arr[i];//(max=>30) // (max=>40)//(max=>50)//(max=>60)
            }
        }
        System.out.println(max); //max=>60
    }
}
