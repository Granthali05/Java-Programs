import java.util.*;
class Avg{
	public static void main(String args[]){
	System.out.println("Enter 3 numbers");
	Scanner in=new Scanner(System.in);
	Double in1;
	Double in2;
	Double in3;
	in1=in.nextDouble();
	in2=in.nextDouble();
	in3=in.nextDouble();
double avg= (in1+in2+in3)/3;	
	
		System.out.println("Average" +avg);
		
	}
}