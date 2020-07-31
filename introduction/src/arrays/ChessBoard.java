package arrays;
import java.util.Scanner;
public class ChessBoard {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int result=0;
		System.out.println("enter no of test cases");
		int t = sc.nextInt();
		System.out.println("now enter the no os side squares for each test case");
		int a[] = new int[t];
		for(int i =0 ; i<t ; i++) {
			a[i] = sc.nextInt();
		}
		for(int i =0 ; i<t ; i++) {
			for(int j = 1 ; j<=a[i];j++) {
				if(j==1) {
					result = 1;
				}
				else {
					result += j*j;
				}
			}
			System.out.println(result);
		}
		

	}

}
