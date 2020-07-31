package whileLoop;
import java.util.Scanner;
public class Palidrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum =0 ;
		int temp = num;
		while(temp>0) {
			int rem = temp % 10;
			sum= sum*10 + rem ;
			temp/= 10;
		}
		if(num == sum) {
			System.out.println(num +" is a palindrome no");
		}
		else {
			System.out.println(num +" is not a palindrome no");
		}

	}

}
