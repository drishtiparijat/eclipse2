package priorityQueue;

import java.util.*;


public class KLargest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of inputs");
		int t = sc.nextInt();
		while(t-- != 0) {
			System.out.println("enter the size of array");
			int n = sc.nextInt();
			System.out.println("enter k");
			int k = sc.nextInt();
			int a[] = new int[n];
			System.out.println("enter elements of array");
			for(int i = 0 ; i<n ; i++) {
				a[i] = sc.nextInt(); 
			}
			
			PriorityQueue<Integer> pq = new PriorityQueue<>();
			for(int i = 0 ; i<n ; i++) {
				if(i<k) {
					pq.add(a[i]);
				}
				else {
					if(pq.peek()< a[i]) {
						pq.poll();
						pq.add(a[i]);
					}
				}
			}
			ArrayList<Integer> ans = new ArrayList<>(pq);
			Collections.sort(ans, Collections.reverseOrder());
			for(int x : ans) {
				System.out.print(x + " ");
			}
			System.out.println();
		}

	}

}
