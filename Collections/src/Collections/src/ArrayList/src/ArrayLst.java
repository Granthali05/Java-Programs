import java.util.*;

public class ArrayLst {
public static void main(String args[]) {
	List<Integer> arr=new ArrayList<>(5);
	for(int i=1;i<10;i++) {
		arr.add(i);
	}
	System.out.println(arr);
	
	arr.remove(2);
	System.out.println(arr);
}
}
