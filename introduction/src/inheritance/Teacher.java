package inheritance;

public class Teacher extends Person{

	public void teach() {
		System.out.println(name+ " is teaching");
	}
	public void eat() {
		System.out.println( name + " is eating");
	}
	public static void laugh() {
		System.out.println( " teacher is laughing");
	}
}

