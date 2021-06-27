class Smallest{
public static void main(String argsjavac []){

Smallest sc=new Smallest();
sc.smallest(12,13,11);
}
void smallest(int a, int b, int c){
if(a<b && a<c){
System.out.println("Smallest is" +a);
}
else if(a>b && b<c){
System.out.println("Smallest is"+b);
}
else{
System.out.println(c);
}

}
}