import java.util.*;
class Atteif{
public static void main(String args[])
{ System.out.println("Enter Lectures Conducted");
Scanner sc=new Scanner(System.in);
int lec=sc.nextInt();
Scanner s=new Scanner(System.in);
System.out.println("Enter Lectures Attended");
int att=s.nextInt();
//System.out.println(lec);
//System.out.println(att);
float per;
per=( att*100 ) / lec;
if(per>=75)
{
	System.out.println("Student is eligible for Exam \n attendance is "+per);
}
else{
	System.out.println(" Is not Eligible \n attendance is "+per);
}

}
}