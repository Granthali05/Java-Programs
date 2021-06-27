import java.util.*;
import java.io.*;
class FileHandling {
public static void main(String args[]) throws FileNotFoundException{
System.out.println("Welcome To Your File Handling System");
System.out.println(" Select the Options Below ");
System.out.println("1) Create Your File");
System.out.println("2) Read Your File");
System.out.println("3) Check if Your File Exists");
Scanner sc=new Scanner(System.in);


int options=sc.nextInt();

switch(options){

case 1: File f=new File("C:\\Users\\Geet\\Desktop\\D1.txt");
	if(f.exists()){
	System.out.println("File Exists");
	System.exit(0);
}
else{
	PrintWriter pw=new PrintWriter(f);
	String str=sc.nextLine();
	pw.print(str);
	pw.close();
	System.out.println("Doc created");
}
break;
case 2: File f1=new File("C:\\Users\\Geet\\Desktop\\D.txt");
		Scanner s=new Scanner(f1);
		while(s.hasNext()){
			String temp=s.next();
			System.out.println(temp);
			}
			s.close();
			break;
case 3:
 File f2=new File("C:\\Users\\Geet\\Desktop\\D.txt");
if(f2.exists()){
	System.out.println("File Exists");
	System.exit(0);
}
	break;
default: System.out.println("Invalid");
}



}
}