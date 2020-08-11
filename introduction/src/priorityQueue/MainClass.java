package priorityQueue;

import java.util.PriorityQueue;

public class MainClass {

	public static void main(String[] args) {
//		PriorityQueue<String> pq = new PriorityQueue<>();
//		pq.add("Kiwi");
//		pq.add("Apple");
//		pq.add("Mango");
//		pq.add("Banana");
//		
//		System.out.println(pq);
//		
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());
//		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(234);
		pq.add(3120);
		pq.add(6);
		pq.add(8349);
		
		System.out.println(pq);
		
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
	}

}
