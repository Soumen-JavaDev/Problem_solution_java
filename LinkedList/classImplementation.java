package linkList;

import java.util.LinkedList;

public class classImplementation {
   public static void main(String args[]) {
       // Create a new LinkedList
       LinkedList<String> list = new LinkedList<String>();

       // Add elements to the list
       list.add("is");
       list.add("a");
       list.addLast("list");
       list.addFirst("this");
       list.add(3, "linked"); // Add "linked" at index 3

       // Print the list
       System.out.println(list);

       // Print the element at index 0
       System.out.println(list.get(0));

       // Print the size of the list
       System.out.println(list.size());  

       // Remove an element at index 3
       list.remove(3);

       // Remove the first element
       list.removeFirst();

       // Remove the last element
       list.removeLast();

       // Print the modified list
       System.out.println(list);
   }
}
