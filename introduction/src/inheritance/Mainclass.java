package inheritance;

public class Mainclass {

	public static void main(String[] args) {
		Teacher t = new Teacher();
		t .name = "mr harry";
		t.eat();
		t.walk();
		t.teach();
		t.laugh();
		
		Singer s = new Singer();
		s.name = "oprah";
		s.eat();
		s.walk();
		s.sing();
		s.laugh();
	}

}
