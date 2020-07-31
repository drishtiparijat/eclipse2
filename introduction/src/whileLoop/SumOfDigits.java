package whileLoop;
import java.util.Scanner;
public class SumOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp= num;
		int sum = 0;
		do {
			sum=0;
		while(temp >0) {
			int lastDigit = temp % 10;
			sum+= lastDigit;
			temp/= 10;
		}
		temp=sum;
		}while(temp>9);
		System.out.println("the repeated sum of "+num + " is "+ sum);
		
	}
}
 