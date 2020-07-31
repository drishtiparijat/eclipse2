package arrays;

import java.util.Scanner;
public class AverageMarks {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter the no of students:");
		 int n = sc.nextInt();
		 int[] marks = new int[n];
		 System.out.println("now enter marks");
		 for(int i= 0 ; i<n ; i++) {
			 marks[i] = sc.nextInt();
		 }
		 int sum = 0;
		 for(int i=0 ;i< n ; i++) {
			 sum+= marks[i];		
			 }
		 int avgMarks = sum/n;
		 System.out.println("average marks = "+ avgMarks);
	}
	

}
