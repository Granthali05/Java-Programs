import java.util.*;
public class QueueD {

	public static void main(String[] args) {
		Queue<Integer> q=new PriorityQueue<>();
		//Adding  Elements 
		q.add(1);
		q.add(3);
		q.add(4);
		q.add(2);
		System.out.println(q);
		//Remove 1st Element
		q.remove();
		System.out.println(q);
		// Remove Head Element
		q.poll();
		System.out.println(q);
		// First Element is Displayed
		int a=q.peek();
		System.out.println(a);
		
	}

}
