package linkedList.myLinkedList;

public class MyMainLinkedList {

	public static void main(String[] args) {
		
		MyLinkedList<Integer> myLL = new MyLinkedList<>();
		MyLinkedList<Integer> toRemoveList = new MyLinkedList<>();
		myLL.add(4);
		myLL.add(5);
		myLL.add(9);
		myLL.add(71);
		myLL.add(32);
		myLL.add(12);
		myLL.add(7);
		myLL.add(0,2);
		myLL.printall();
		
		

	}

}
