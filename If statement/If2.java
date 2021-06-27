import java.util.*;
class If2{
	public static void main(String args[]){
		System.out.println("Enter the quantity of objects purchased");

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int total= n*100;
		if(total>=1000){
			int per= total*10/100;
			int newtotal=total-per;
			System.out.println("Your purchase is above 1000 rupees \n Your Bill is"+newtotal+"\n You have discount of 10%");
		}
		else{
			System.out.println("Your total is"+total);
		}
	}
}