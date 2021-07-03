import java.util.*;
public class StackD {

	public static void main(String[] args) {
		Stack<String> s=new Stack<>();
		s.push("A");
		s.push("E");
		s.push("I");
		s.push("O");
		s.push("U");
		//Printing Stack 
		System.out.println(s);
		// Pop the Elements 
		s.pop();
		System.out.println(s);
		// Peek the element 
		String a=s.peek();
		System.out.println(a);
		
		
	}

}
