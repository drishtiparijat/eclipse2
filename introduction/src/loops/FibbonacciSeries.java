package loops;
import java.util.Scanner;

public class FibbonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.print(a+" ");
		System.out.print(b+" ");
		
		for(int i=0; i<n-2 ; i++) {
		int c = a+b;
		System.out.print(c +" ");
		a = b;
		b = c;
		}
	}

}
