package LinkedList;
public class linkList {
    class Node{
        int data;
        Node next;
        Node(int data){
          this.data=data;
        }
    }
    public static void main(String[] args) {
        int[] arr={2,4,5,8};
       Node head= arrToLinkList(arr);
          printlinklist(head);

    }
    static void printlinklist(Node head){
        Node courent=head;
        while (courent!=null) {
            System.out.print(courent.data+" ");
            courent=courent.next;
        }
        System.out.println();
    }
    static Node arrToLinkList(int[] arr){
        Node head = new linkList().new Node(arr[0]);
      Node temp=head;
      for(int i=1;i<arr.length;i++){
        Node nn = new linkList().new Node(arr[i]);
       temp.next=nn;
       temp=nn;
      }
      return head;
    }
}
