import java.util.*;
class Average{
public static void main(String args[]){

Average av=new Average();
av.avg();


}
void avg(){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int avg= (a+b+c)/3;
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(avg);

}

}
