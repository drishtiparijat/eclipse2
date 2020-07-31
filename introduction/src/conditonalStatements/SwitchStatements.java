package conditonalStatements;
import java.util.Scanner;
public class SwitchStatements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the day's number");
		int no = sc.nextInt();
		
		switch(no) {
		case 1: case 2:
			System.out.println("the day is hot");
			break;
		case 3:
			System.out.println("the day is cold");
			break;
		case 4:
			System.out.println("the day is sunny");
			break;
		case 5:
			System.out.println("the day is rainy");
			break;
		case 6:
			System.out.println("the day is romantic");
			break;
		case 7:
			System.out.println("the day is irritating");
			break;
		default:
			System.out.println("bad day");
		}
		
	}

}
