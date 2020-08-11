package linkedList;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;

        public SinglyLinkedList() {
            this.head = null;
        }

      
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node) throws IOException {
        while (node != null) {
            System.out.println(String.valueOf(node.data));

            node = node.next;

           
        }
    }

    // Complete the insertNodeAtTail function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode toAdd = new SinglyLinkedListNode(data);
            boolean isEmpty;
            if(head == null){
                isEmpty = true;
            }else{
                isEmpty = false;
            }

            if(isEmpty){
                head = toAdd;
                return head;
            }
            
            
            SinglyLinkedListNode temp = head;
            while(temp.next!= null){
                temp = temp.next;
            }
            temp.next = toAdd;

            return head;
            
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
     //   BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        SinglyLinkedList llist = new SinglyLinkedList();

        int llistCount = scanner.nextInt();
       

        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
           //goood
           //thanks 
        	
          SinglyLinkedListNode llist_head = insertNodeAtTail(llist.head, llistItem);

          llist.head = llist_head;
        }



        printSinglyLinkedList(llist.head);
     
        scanner.close();
    }
}
