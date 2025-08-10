package Day2;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        int totalStudents = sc.nextInt();
		        int numGroups = sc.nextInt();
		        
		        int studentsPerGroup = totalStudents / numGroups;
		        int remainingStudents = totalStudents % numGroups;
		        System.out.println("The number of students in each team is " + studentsPerGroup + " and left out is " + remainingStudents);
		        sc.close();
		    }
		}


	