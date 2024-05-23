package linkList;
import java.util.*;
// import java.io.*;


public class DeleteNthNode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        int n = input.nextInt();
        for(int i = 0; i < n; i++){
            int x = input.nextInt();
            ll.add(x);
        }

		int size = n;
        int toRemove = input.nextInt();
        Solution S = new Solution();
        S.remove(ll, toRemove, size);
        Node curr = ll.head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        input.close();
    }
}

 
class Node{
    int data;
    Node next = null;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class LinkedList{
    Node head;
    void add(int data){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            return;
        }
        Node curr = head;
        while(curr.next != null)
            curr = curr.next;
        curr.next = new_node;
    }
}
 
class Solution {
    public void remove(LinkedList ll, int toRemove, int size){
       Node h=ll.head;
        if(h==null)return;
        if(toRemove==0){
            h=h.next;
            ll.head=h;
            return;
        }
        Node temp=h;
        for(int i=0;i<toRemove-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return;
    }

	


	public static void printLinkedList(LinkedList ll) {
		Node temp = ll.head;
		while(temp != null) {
			System.out.print(temp.data);
			temp = temp.next;
		}
	}
}