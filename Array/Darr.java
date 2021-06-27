class Darr{
public static void main(String args[]){

double[][] arr= { {1,2,3,4},{7,8,9,10},{2,3,4,1}};
print(arr);
sum(arr);
}
private static void print(double[][] arr){
	for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr[i].length;j++){
	System.out.println(arr[i][j]);
		}
	}
	
	
}

private static void sum(double[][] arr){
	int sum=0;
		for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr[i].length;j++){
			sum+=arr[i][j];
		}
		}
		System.out.println("Sum is"+sum);
		
}
}

