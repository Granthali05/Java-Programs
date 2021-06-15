import java.util.*;
class Arr1{
public static void main(String args[]){
int[] a={1,2,3,4,5,6,7,8,9,10};
for(int i=0;i<a.length;i++){
System.out.println(a[i]);
}
arIndex(a);
arReElement(a);
}
public static void arIndex(int[] a){
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int find=Arrays.binarySearch(a,n);// To Find index of Array 
System.out.println("We found your number"+n+" at index"+find);//Prints the value to be found

}

public static void arReElement(int[] a){
//System.out.println(a);
System.out.println("Enter number to be removed");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

for (int i=n;i< a.length -1;i++){
a[i]=a[i-1];
}
 System.out.println("After removing the element: "+Arrays.toString(a));
}
}