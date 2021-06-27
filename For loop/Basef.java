import java.util.*;
class Revf{
public static void main(String args[]){
System.out.println("Enter power");
Scanner s=new Scanner(System.in);
int a=s.nextInt();
System.out.println("Enter Base");
int b=s.nextInt();

int result=1;
for(int i=0;i<=a;i++){
	result *= b;
	
}
System.out.println(result);




}

}