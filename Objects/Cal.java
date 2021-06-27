import java.util.*;
class Cal{
public void avg(){
System.out.println("Enter values of a,band c");
int a;
int b;
int c;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
int avg= (a+b+c)/3;
System.out.println("Average is"+avg);

}
}
class Avg{
public static void main(String args[]){
Cal c1=new Cal();
c1.avg();

}

}