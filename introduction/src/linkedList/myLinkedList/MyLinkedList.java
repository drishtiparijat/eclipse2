package linkedList.myLinkedList;

public class MyLinkedList<E> {
	Node<E> head;
	public void add (E data) {
		Node<E> toAdd = new Node<E>(data);
		if(head == null) {
			head = toAdd;
			return;
		}
		
		Node<E> temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = toAdd;
		toAdd.prev =temp;
	}
	
	public void printall() {
		Node<E> temp = head;
		
		while(temp!= null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	public void printIndex(int start , int end) {
		Node<E> temp = head;
		int i = 0 ;
		while(i<start) {
			temp = temp.next;
			i++;
		}
		
		for(int j = start ; j<end ; j++) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	public void set(int index , E value) {
		Node<E> toAdd = new Node<E>(value);
		Node<E> temp = head;
		if(index==0) {
			toAdd.next = temp.next;
			head = toAdd;
			
		}else {
			int i=0;		
		while(i<index-1) {
			temp = temp.next;
			i++;
		}
		Node<E> a=temp.next.next;
		temp.next= toAdd;
		toAdd.next= a;
		}
	}
	
	public void add(int index , E value) {
			Node<E> toAdd = new Node<E>(value);
			Node<E> temp = head;
			if(isEmpty()) {
				head = toAdd;
				return;
			}
			if(index==0) {
				toAdd.next = head;
				head = toAdd;
				return;
			}
			for(int i=0 ; i< index-1 ; i++) {
				temp = temp.next;
			}
			Node<E> a=temp.next;
			temp.next= toAdd;
			toAdd.next= a;
					
	}
	
	public boolean isEmpty(){
			return head == null;
		}

	public void remove(int index) {
		Node<E> temp = head;
		if(index==0) {
			head = temp.next;
		}else {
		int i= 0;
		while(i<index-1) {
			temp = temp.next;
			i++;
		}
		Node<E> a=temp.next.next;
		temp.next = a;
		}
	}
	
	public boolean contains(E value) {
		Node<E> temp = head;		
		while(temp!= null) {
			if(temp.data== value) {
				return true;
			}temp = temp.next;
		}
		return false;
	}
	
	public int getIndex(E value) {
		int i =0;
		Node<E> temp = head;
		while(temp!= null) {
			if(temp.data == value) return i;
			temp = temp.next;
			i++;
		}
		return -1;
	}
	
	public E get(int index) {
		int i=0;
		Node<E> temp = head;
		while(i<index) {
			temp = temp.next;
			i++;
		}
		return temp.data;
	}
	
	public int size() {
		int i =0;
		Node<E> temp = head;
		while(temp!= null) {
			temp = temp.next;
			i++;
		}
		return i;		
	}
	
	public void removeAll(MyLinkedList<E> list) {
		for(int i=0 ; i< list.size() ; i++) {
			E x = list.get(i);
			int p = getIndex(x);
			remove(p);
		}
	}
	
	public E removeLast() throws Exception {
		Node<E> temp = head;
		if(temp == null) {
			throw new Exception ("cannot remove last element from empty linked list");
		}
		
		if(temp.next == null) {
			Node<E> toRemove = temp.next;
			head = null;
			return toRemove.data;
		}
		while(temp.next.next != null) {
			temp = temp.next;
		}
		Node<E> toRemove = temp.next;
		temp.next = null;
		
		return toRemove.data;
		
	}
	
	public E getLast() throws Exception {
		Node<E> temp = head;
		if(temp == null) {
			throw new Exception ("cannot peek last element from empty linked list");
		}
		
		while(temp.next!= null) {
			temp = temp.next;
		}
		return temp.data;
		
	}
		
	
	public static class Node<E>{
		public E data; 
		public Node<E> next;
		public Node<E> prev;
		
		public Node(E data) {
			this.data = data;
			next = null;
		}
	}
}
