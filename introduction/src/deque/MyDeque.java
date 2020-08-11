package deque;

public class MyDeque<E> {
	
	Node<E> head,tail;
	
	public void addToHead(E data) {
		
		Node<E> toAdd = new Node<>(data);
		if(head == null) {
			head = tail = toAdd;
			return;
		}
		
		head.next = toAdd;
		toAdd.prev = head;
		head = toAdd;
		
	}
	
	public void addToTail(E data) {
		Node<E> toAdd = new Node<>(data);
		if(head == null) {
			head = tail = toAdd;
			return;
		}
		
		tail.prev = toAdd;
		toAdd.next = tail;
		tail = toAdd;
		
	}
	
	public E removeLast() {
		if(head == null) {
			return null;
		}
		Node<E> toRemove = tail;
		tail = tail.next;

		if(tail == null) {
			head = null;
			return toRemove.data;
		}
		tail.prev = null;
		
		 return toRemove.data;
	}
	
	public E removeFirst() {
		if(head == null) {
			return null;
		}
		Node<E> toRemove = head;
		head = head.prev;
		
		
		if(head == null) {
			tail = null;
			return toRemove.data;
		}
		head.next = null;
		return toRemove.data;
		
	}
	
	public E peekFirst() {
		if(head == null) {
			return null;
		}
		
		return head.data;
	}
	
	public E peekLast() {
		if(head == null) {
			return null;
		}
		return tail.data;
	}
	
	public static class Node<E>{
		E data ;
		Node<E> next, prev ;
		
		public Node(E data) {
			this.data = data ;
			this.next = this.prev = null;
		}
	}

}
