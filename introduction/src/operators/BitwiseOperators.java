package operators;
import java.util.Scanner;
public class BitwiseOperators {

	public static void main(String[] args) {
		Scanner no = new Scanner(System.in);
		int a = no.nextInt();
		int b = no.nextInt();
		
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a>>1);
		System.out.println(b<<1);
		

	}

}
