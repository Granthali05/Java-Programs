import java.util.*;
class Aruser{
public static void main(String args[]){

int n;
System.out.println("Enter your array size");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
//Take array as input from user
int[] arr=new int[n];
System.out.println("Enter array");
for(int i=0;i<arr.length;i++){
arr[i]=sc.nextInt();
}
//Print Array
System.out.println("Array is");
for(int i=0;i<arr.length;i++){
	
System.out.println(arr[i]);

}	

// sum of the array
int sum=0;
for(int i=0;i<arr.length;i++){
	sum+=arr[i];
}
System.out.println("Sum is"+sum);
//Reverse Array
System.out.println("Reverse array is");
for(int i=arr.length-1;i>=0;i--){
	System.out.println(arr[i]);
}
}
}

