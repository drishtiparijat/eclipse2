package queue;

public class MainClass {

	public static void main(String[] args) {
		
		MyQueue<Integer> mq = new MyQueue<>();
		
		mq.enqueue(12);
		mq.enqueue(2);
		mq.enqueue(912);
		mq.enqueue(129);
		
		System.out.println(mq.peek());
		System.out.println(mq.dequeue());
		System.out.println(mq.peek());
		System.out.println(mq.dequeue());
		System.out.println(mq.peek());
		System.out.println(mq.dequeue());
		System.out.println(mq.peek());
		System.out.println(mq.dequeue());
		System.out.println(mq.peek());
		System.out.println(mq.dequeue());
		
		
		mq.enqueue(1292);
		System.out.println(mq.peek());
		System.out.println(mq.dequeue());
	}

}
