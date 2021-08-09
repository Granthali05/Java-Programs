import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
List<String> l=new LinkedList<>();
// Adding Elements to Linked List
l.add("A");
l.add("B");
l.add("C");
System.out.println(l);// Printing the List 

//Remove Element From Linked List
l.remove(1);
System.out.println(l); // Element at index 1 is removed

// Accesing Elements From Linked List
boolean b=l.contains("C");
System.out.println(b);






	}

}
