import java.util.*;
class Switch{
	public static void main(String args[]){
		System.out.println("Enter Number 1 to 7");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		String weekday;
		switch(num){
			case 1: weekday="Monday";
			break;
			
			case 2: weekday="Tuesday";
			break;
			
		case 3: weekday="Wednesday";
			break;
			
			case 4: weekday="Thursday";
			break;
			
			case 5: weekday="Friday";
			break;
			
			case 6: weekday="Saturday";
			break;
			
			case 7: weekday="Sunday";
			break;
		
			 default: weekday="Invalid" ;
		
		
		}
		System.out.println("Day is "+weekday);
			
	}
}