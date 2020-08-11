package deque;

public class MainClass {

	public static void main(String[] args) {
		MyDeque<Integer> md = new MyDeque<>();
		
		md.addToTail(2);
		md.addToTail(23);
		md.addToTail(27);
		md.addToTail(298);
		System.out.println(md.peekLast());
		System.out.println(md.removeLast());
		System.out.println(md.peekLast());
		System.out.println(md.removeLast());
		System.out.println(md.peekLast());
		System.out.println(md.removeLast());
		System.out.println(md.peekLast());
		System.out.println(md.removeLast());
		System.out.println(md.peekLast());
		System.out.println(md.removeLast());
		
	}

}
