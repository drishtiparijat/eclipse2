package forLoopsExercise;
import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
			for(int i=1 ; i<= n ; i++) {
			int k = n-i+1;
			int p =n-1;
			for(int j =1; j<= n-i ; j++) {
				System.out.print("  ");
			}
			if(i>=2) {
			for(int j=1 ; j<=i-1 ; j++) {
				System.out.print(k++ +" ");
				}
			}
			System.out.print("0 ");
			if(i>=2) {
				for(int j=1 ; j<=i-1 ; j++) {
					System.out.print(p-- +" ");
					}
				}
			
			System.out.println();
		}
		
	}

}
