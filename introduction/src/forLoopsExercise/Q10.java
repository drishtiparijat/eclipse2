package forLoopsExercise;
import java.util.Scanner;
public class Q10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n>1) {
		for(int i=1; i<=n-1 ; i++) {
			for(int j=1; j<=n-i ;j++) {
				System.out.print("  ");
			}
			System.out.print("* ");
			if(i>1) {
				for(int j=1 ; j<=i-2 ; j++) {
					System.out.print("  ");
				}
				System.out.print("* ");
			}
			System.out.println();
			}
		for(int i=1; i<=n; i++) {
			System.out.print("* ");
		}
	}
		else {
			System.out.println("*");
		}
	}
}
