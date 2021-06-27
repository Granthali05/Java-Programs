import java.util.*;
class Area1{
	public static void main(String args[]){
		System.out.println("Enter your radius");

		Scanner radius= new Scanner(System.in);
		double r;
		
		r=radius.nextDouble();
		System.out.println("Area"+ r*r*3.14);
	}
}