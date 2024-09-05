import java.util.Scanner;

class Node{
     int data;
     Node next;
    Node(int data){
        this.data=data;
    }
}
/**
 * InnerlinkedList
 */
 class List {
   private Node head;
   int size;
   public List(){
   this.head=null;
   size=0;
   }
  public void add(int data){
     Node newNode=new Node(data);
     if(head==null){
        head=newNode;
        size++;
     }else{
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
       curr.next=newNode;
       size++;
     }
  }
  public void Print(){
    Node curr=head;
    while(curr!=null){
        System.out.print(curr.data+"->");
        curr=curr.next;
    }
   
    System.out.println("null");
  }
  public void addFirst(int data){
    Node newNode=new Node(data);
    if(head==null){
      head=newNode;
      return;
    }else{
        newNode.next=head;
        head=newNode;
    }
  }
   public boolean isEmpty(){
    return head==null;
   }
   public void removeAll(){
    head=null;
   }
    
}
public class linkedList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List ll=new List();
        for(int i=0;i<n;i++){
            ll.add(sc.nextInt());
        }
       System.out.println("addfirst"); 
       ll.addFirst(sc.nextInt());
       ll.Print();
       System.out.println("size"+ll.size);
       ll.removeAll();
       System.out.println("isEmpty()"+ll.isEmpty());
       ll.Print();
        sc.close();
    }
}
