package Stacks;

import linkedList.myLinkedList.MyLinkedList;

public class MyStacks<E> {
	
	private MyLinkedList<E> ll = new MyLinkedList<>();
	void push(E e) {
		ll.add(e);
	}
	
	 E pop() throws Exception{
		if(ll.isEmpty()) {
			throw new Exception("popping from empty stack is not allowed");
		}		
		 return ll.removeLast();		
	}
	
	E peek() throws Exception{
		if(ll.isEmpty()) {
			throw new Exception("peeking from empty stack is not allowed");
		}
		return ll.getLast();	
	}

}
