import java.io.*;
import java.util.*;

class FileIO2{
public static void main(String args[]) throws FileNotFoundException{

File f=new File("C:\\Users\\Geet\\Desktop\\Demo.txt");
Scanner sc=new Scanner(f);
while(sc.hasNext()){
String temp=sc.next();
System.out.println(temp);	
	
	
}
sc.close();



}
}