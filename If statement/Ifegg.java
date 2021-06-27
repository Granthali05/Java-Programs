import java.util.*;
class Ifegg{
	public static void main(String args[]){
		System.out.println("Choose any option");
		System.out.println("1.add");
		System.out.println("2.subtract");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		if(a==1){
			System.out.println("Enter 2 values");
			Scanner s=new Scanner(System.in);
		int s1=s.nextInt();
		int s2=s.nextInt();
		int sum=s1+s2;
		System.out.println("Sum is:"+sum);
			
		} else if (a==2){
			System.out.println("Enter 2 values to subtract");
			Scanner sn=new Scanner(System.in);
		int s3=sn.nextInt();
		int s4=sn.nextInt();
		int sum=s3-s4;
		System.out.println("Sub is:"+sum);
			
		}
		else{
			System.out.println("Choose correct alternative");
		}
	}
}
		 