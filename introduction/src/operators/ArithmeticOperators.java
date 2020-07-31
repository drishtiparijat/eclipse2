package operators;
import java.util.Scanner;
public class ArithmeticOperators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("add is "+(a+b));
		System.out.println("mul is "+(a*b));
		System.out.println("sub is "+(b-a));
		System.out.println("div is "+(b/a));
		System.out.println("remainder is "+(b%a));

	}

}
