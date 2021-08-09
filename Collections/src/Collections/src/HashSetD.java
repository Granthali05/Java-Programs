
import java.util.*;
class HashSetD{
	public static void main(String args[]) {
	// STORES UNIQUE VALUES
		Set<String> a=new HashSet<String>();
	// Adding Element in HashSet
		a.add("A");
		a.add("B");
		a.add("C");
		a.add("C");
		System.out.println(a);
	//Remove Elements 
		a.remove("A");
		System.out.println(a);
		
	// Accessing Elements 
		boolean e=a.contains("B");
		System.out.println(e);
	
		}
}