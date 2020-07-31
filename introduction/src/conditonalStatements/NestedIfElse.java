package conditonalStatements;
import java.util.Scanner;
public class NestedIfElse {

	public static void main(String[] args) {
		Scanner no = new Scanner(System.in);
		
		int a = no.nextInt();
		int b = no.nextInt();
		int c = no.nextInt();
		
		int result;
		
		result = a < b ? a < c ? a : c : b < c ? b : c ;
		
		System.out.println("lowest of three nos is "+ result);
	}

}
