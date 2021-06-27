class ArrP{
public static void main(String args[]){
double[] arr={1,4.5,3,5.90,8,5,3.2,2.1};
ArrayP(arr);
ArrayS(arr);
MaxP(arr);


}
public static void ArrayP(double[] arr){

for(int i=0;i<arr.length;i++){

System.out.println(arr[i]);


}
}

public static void ArrayS(double[] arr){
	double sum=0;
	for(int i=0;i<arr.length;i++){
		sum+=arr[i];
		
}System.out.println("Sum is"+sum);
}
public static void MaxP(double[] arr){
double temp=0;
for(double value:arr){
		if(value > temp){
			temp=value;
		}

}System.out.println("Largest Number "+temp);
	
}
}