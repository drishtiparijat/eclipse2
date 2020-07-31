package loops;

public class Table {
	public static void main(String[] args) {
		
		System.out.print("x ");
		for(int i=1; i<=20; i++) {
			System.out.print(i +" "); 
		}
		System.out.println();
		for(int i=1; i<=20; i++) {
			System.out.print(i +" "); 
			for(int j=1; j<=20; j++) {
				System.out.print(i*j +" ");
			}
			System.out.println();
		}
	}

}
