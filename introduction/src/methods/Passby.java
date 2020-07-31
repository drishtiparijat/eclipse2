package methods;

public class Passby {

	public static void main(String[] args) {
		int a = 23;
		int b = 32;
		swap(a , b);
		System.out.println(a +" "+b );
	}

	static void swap(int p , int q) {
		int temp = p;
		p = q;
		q = temp;
		
	}

}
