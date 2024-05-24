package LinkedList;


    
    import java.util.*;


    public class MiddleNodeOfLinkedList {
        public static void main(String[] args) throws Throwable {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            LinkedList llist= new LinkedList(); 
            int a1=sc.nextInt();
            Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) 
            {
                int a = sc.nextInt(); 
                llist.addToTheLast(new Node(a));
            }
                
            Solution A = new Solution();
            llist.head = A.midpointOfLinkedList(llist.head);
            llist.printList();
            sc.close();
        }
    }
    
    class Node
        {
            int data;
            Node next;
            Node(int d) {data = d; next = null; }
        }
        
    class LinkedList
    {
        Node head;  
        Node tail;
        public void addToTheLast(Node node) 
        {
          if (head == null) 
          {
           head = node;
           tail = node;
          } 
          else 
          {
           tail.next = node;
           tail = node;
          }
        }
          void printList()
        {
            Node temp = head;
            while (temp != null)
            {
               System.out.print(temp.data+" ");
               temp = temp.next;
            }  
            System.out.println();
        }
        
    }
    
    class Solution
    {
        Node midpointOfLinkedList(Node head)
        {
           int n=0;
            Node temp=head;
            while(temp!=null){
                n++;
               temp= temp.next;
            }
          
            temp=head;
            for(int i=0;i<n/2;i++){
                temp=temp.next;
            }
            return temp;
        }
        
    }
