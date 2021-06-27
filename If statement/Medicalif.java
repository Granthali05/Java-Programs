import java.util.*;
class Medicalif{
public static void main(String args[]){
System.out.println("Enter if you have any health problem");
System.out.println("Enter Y or N");
Scanner sc=new Scanner(System.in);
String sign=sc.nextLine();
if(sign.equals('Y')){
System.out.println("Your response is Yes");
}
else{
System.out.println("Your response is No");
}
}
}
