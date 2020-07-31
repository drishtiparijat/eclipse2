package inheritance;

public class Singer extends Person{

	public void sing() {
		System.out.println(name+ " is singing");
	}
	public void eat() {
		System.out.println( name + " is eating");
	}
	public static void laugh() {
		System.out.println("singer is laughing");
	}
}
