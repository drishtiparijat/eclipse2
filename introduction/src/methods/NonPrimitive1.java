package methods;
class Cat{
	int eyes;
}

public class NonPrimitive1 {
	public static void main(String[] args) {
		Cat c1 = new Cat();
		c1.eyes = 3;
		changeEyes(c1);
		System.out.println(c1.eyes);
		
	}
	
	static void changeEyes(Cat a) {
		a.eyes = 2;
		
	}

}
