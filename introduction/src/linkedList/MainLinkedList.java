package linkedList;
import java.util.*;
public class MainLinkedList {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		List<Integer> ll = new LinkedList<>();
		
		getTimeDiff(al);
		getTimeDiff(ll);
	}
	
	public static void getTimeDiff(List<Integer> list) {
		long start = System.currentTimeMillis();
		for(int i= 0 ; i<100000 ; i++) {
			list.add(0,i);
		}
		long end =	System.currentTimeMillis();
		System.out.println(list.getClass().getName() + "-->" + (end - start));
	}

}
