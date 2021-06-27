import java.io.*;
import java.util.*;
class FileIO1{
public static void main(String args[]) throws FileNotFoundException
{
File f=new File("C:\\Users\\Geet\\Desktop\\Demo.txt");
if(f.exists()){
	System.exit(0);
	
}

PrintWriter pw=new PrintWriter(f);

pw.print("Hey I'm Back , I hope this program works");

pw.close();


}

}