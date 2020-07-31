package conditonalStatements;
import java.util.Scanner;

public class ForLoops {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int factorial = 1;
		
		for(int i = n; i > 0; i--) {
			factorial*= i;
		}
		
		System.out.println("factoial of " + n + " is " + factorial);
	}

}
