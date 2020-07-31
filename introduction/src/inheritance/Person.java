package inheritance;

public class Person {
	protected String name;
	
	public void walk() {
		System.out.println("person " + name + " is walking");
	}

	public void eat() {
		System.out.println("person " + name + " is eating");
	}
	
	public static void laugh() {
		System.out.println("person is laughing");
	}
}
