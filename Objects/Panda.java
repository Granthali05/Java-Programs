class Panda{
public void Peri(double a, double b){
	double Peri=2*(a+b);
	System.out.println("Perimeter is"+Peri);
	}
public  void Area(double a,double b){
	double area=a*b;
	System.out.println("Area is"+area);
	}
}
class Rect{
public static void main(String args[]){

Panda a=new Panda();
Panda a1=new Panda();
//System.out.println("Perimter is"+a.Peri(4,5)+"Area is"+a.Area(4,5));
//System.out.println("Perimeter is"+a1.Peri(5,8)+"Area is"+a1.Area(5,8));
a.Peri(4,5);
a.Area(4,5);
a1.Peri(5,8);
a1.Area(5,8);
}
}