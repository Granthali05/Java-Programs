import java.util.*;
class Empif{
public static void main(String args[]){
	System.out.println("Hello, Enter your details \n Enter your age");
	Scanner sc=new Scanner(System.in);
	int age=sc.nextInt();
	System.out.println("Enter your Sex \n type M or F");
	Scanner s1=new Scanner(System.in);
	String sex=s1.nextLine();
	System.out.println("Enter Martial status Y or N");
	Scanner s2=new Scanner(System.in);
	String ms=s2.nextLine();
	//if employee is female, then she will work only in urban areas.
if(sex.equals('F') || age>=20 && age<=60){
	System.out.println("Will work in Urban Areas");
}
//if employee is a male and age is in between 20 to 40 then he may work in anywhere

else if (sex.equals('M')|| age>=20 && age<=40){
	System.out.println("Can work anywhere");
}
//if employee is male and age is in between 40 t0 60 then he will work in urban areas only.
else if(sex.equals('M')|| age>=40 && age <=60){
System.out.println("Will work in Urban Region");
}
else{
System.out.println("Invalid");
}
}
}