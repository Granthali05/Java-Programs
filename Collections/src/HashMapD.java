import java.util.*;

public class HashMapD {

	public static void main(String[] args) {
Map<Integer,String> m=new HashMap<>();
// Adding Values and Keys 
m.put(1,"a");
m.put(3,"c");
m.put(2,"b");
m.put(4, "e");
m.put(6, "q");
m.put(5, "m");
System.out.println(m);

// Size Map Values and Keys
int a=m.size();
System.out.println(a);
//Keys ==> SET(Unique values)
//Values ==> LIST
//To fetch the value from key: get(value)
// To check if key is present : obj.containsKey("element");
Map<String,Integer> treemap=new TreeMap<>();
treemap.put("A",2);
treemap.put("B",1);
System.out.println(treemap);





	}
	

}
