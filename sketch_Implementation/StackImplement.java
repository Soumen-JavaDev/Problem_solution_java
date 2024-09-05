/**
 * StackImplement.java
 */
class Stack{
   private int element[];
    int size;
   private int capacity;
    Stack(int capacity){
          this.capacity=capacity;
          element=new int[capacity];
          size=0;
    }
    public  void push(int val){
        
        if(size==capacity){
          System.out.print("Stack is overflow");
        }else{
            
            element[size++]=val;
        }
    }
    public int pop(){
        if(size==0)return -1;
       int  elemen=element[--size];
        return elemen;
    }
    public int peek(){
        if(size==0)return -1;
        return element[size-1];
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        if(size==0)return true;
        return false;
    }
    public void Print(){
        if(size==0)
          return;

        for(int i=size-1;i>=0;i--){
            System.out.print(element[i]+" ");
        }
    }

}
public class StackImplement{
public static void main(String[] args) {
    Stack stk=new Stack(5);
    stk.push(1);
    stk.push(2);
    stk.push(3);
    stk.push(4);
    stk.push(5);
    stk.Print();
    // System.out.println(stk.size());
    // System.out.println(stk.peek());
    // System.out.println(stk.pop());
    // System.out.println(stk.pop());
    // System.out.println(stk.pop());
    // System.out.println(stk.pop());
    // System.out.println(stk.pop());
    // System.out.println(stk.pop());
    // System.out.println(stk.size());
    // System.out.println(stk.isEmpty());
}
    
}