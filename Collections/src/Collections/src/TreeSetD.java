import java.util.*;
public class TreeSetD {

	public static void main(String[] args) {
		//Maintains natural order automatically as well as Unique...
		Set<Integer> s=new TreeSet<>();
		// Adding Elements to TreeSet
		s.add(1);
		s.add(3);
		s.add(2);
		s.add(3);
		System.out.println(s);
		
		//Accessing Elements From TreeSet
		boolean b=s.contains(2);
		System.out.println(b);
		
		// Removing Elements from TreeSet
		
		s.remove(3);
		System.out.println(s);

	
	}

}
