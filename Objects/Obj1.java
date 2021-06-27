class Obj1{
public void Perimeter(double a,double b,double c){
	double perimeter=a+b+c;
	System.out.println("Perimeter:"+perimeter);

}
}
class Main{
	
	public static void main(String args[]){
		Obj1 tr=new Obj1();
		tr.Perimeter(3,4,5);
	}
}