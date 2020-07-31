package conditonalStatements;
import java.util.Scanner;
public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		int a = sc.nextInt();
		System.out.println("enter the second number");
		int b = sc.nextInt();
		System.out.println("enter the operator");
		sc.nextLine();
		char operation = sc.nextLine().charAt(0);
		
		int result = 0;
		switch(operation) {
		case '+' :
			result = b + a;
			break;
		case '-' :
			result = a-b;
			break;
		case '*' :
			result = b * a;
			break;
		case '/' :
			result = a/b;
			break;
		case '%' :
			result = a % b;
			break;
		default :
			System.out.println("Not a valid operator");
		
		}
		
		System.out.println("result is "+ result);
	}

}
