// TO Get a List Of Files/Directory from the given
import java.util.*;
import java.io.*;
class Display{
public static void main(String args[]){
File f=new File("/Geet/Desktop/");
String[] list=f.list();
for(String n:list){
System.out.println(n);
}
}
}