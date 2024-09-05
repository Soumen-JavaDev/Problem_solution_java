class Node {
      int data;
      Node next;
      Node (int data){
        this.data=data;
        this.next=null;
      }
}
class Queue{
    Node head;
    int size;
    public void add(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            
        }else{
            Node curr=head;
            while(curr.next !=null){
                curr=curr.next;
            }
            curr.next=newNode;
        }
        size++;
    }
    public int peek(){
        if(head==null){
            return -1;
        }
        return head.data;
    }
    public int poll(){
        if(head==null){
            return -1;
        }
        Node temp=head;
        int data=temp.data;
        head=temp.next;
        temp=null;
        size--;
        return data;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size<=0;
    }

}

public class QueueImplement {
    
   public static void main(String[] args) {
    Queue que=new Queue();
    // que.add(1);
    // que.add(2);
    // que.add(3);
    // que.add(4);
    // que.add(5);
    que.add(6);
    System.out.println(que.peek());
    System.out.println(que.poll());
    System.out.println(que.peek());
    System.out.println(que.size());
    System.out.println(que.isEmpty());
    
   }
}
