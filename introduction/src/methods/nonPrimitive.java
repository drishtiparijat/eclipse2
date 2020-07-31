package methods;

class Dog{
	int legs;
}

public class nonPrimitive {

	public static void main(String[] args) {
		Dog a = new Dog();
		a.legs = 4;
		Dog b = new Dog();
		b.legs = 3;
		swap(a ,b);
		System.out.println("Dog a has "+ a.legs +" legs and Dog b has "+ b.legs + " legs");
	}

	static void swap(Dog p, Dog q) {
		Dog temp = p;
		p = q;
		q = temp;
		
	}

}
