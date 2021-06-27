import java.util.*;
class Area{
	double a;
	double b;
public void setDim(){
	System.out.println("Enter values of l and b");
Scanner sc=new Scanner(System.in);
a=sc.nextDouble();
 b=sc.nextDouble();

System.out.println("Value l is"+a);
System.out.println("Value b is"+b);
}
public void Area(){
double area=a*b;
System.out.println("Area is"+area);
}
}
class RecA{
public static void main(String args[]){
Area a1=new Area();

a1.setDim();
a1.Area();
}
}


