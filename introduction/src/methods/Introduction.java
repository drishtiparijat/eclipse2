package methods;

public class Introduction {

	public static void main(String[] args) {
		
		int firstnumber = 34;
		int secondnumber = 12;
		
		sayHi();
		int result = maxOf(firstnumber , secondnumber);
		System.out.println(result);
	}

		static void	 sayHi() {
		System.out.println("hello everyone");
		
	}

		static int maxOf(int a, int b) {
		if (a>b) {
			return a;
		}
		else {
			return b;
		}
	}

}
