import java.util.*;
class Factf{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int fact=1;

for(int i=1;i<=num;i++)
{	fact *=i;
	//fact= num*(num-i)*1;
	System.out.println(fact);
}
System.out.println(fact);

}
}