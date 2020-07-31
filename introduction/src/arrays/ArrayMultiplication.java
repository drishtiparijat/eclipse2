package arrays;
import java.util.Scanner;
public class ArrayMultiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the dimensions");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		int a[][] = new int[x][y];
		int b[][] = new int[y][z];
		int c[][] = new int[x][z];
		
		System.out.println("enter the elements of array a");
		for(int i=0 ; i<x ; i++) {
			for(int j= 0 ; j< y ; j++) {
				a[i][j] = sc.nextInt();
			}
		}System.out.println("enter the elements of array b");
		for(int i=0 ; i<y ; i++) {
			for(int j= 0 ; j< z ; j++) {
				b[i][j] = sc.nextInt();
			}
		}System.out.println("the multiplication of a and b is displayed as c");
		for(int i =0 ; i< x ; i++) {
			for(int j=0 ; j<z ; j++) {
				c[i][j] = 0;
				for(int k =0 ;k<y ;k++) {
					c[i][j]+= a[i][k]+ b[k][j];
				}	System.out.print(c[i][j]+ " ");
			}
			System.out.println();				
		}
		

		
	}

}
