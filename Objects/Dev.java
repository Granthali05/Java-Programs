class Emp{
	String name;
	String Address;
	float salary;

	Emp(String name, String addr, float sal){
		this.name=name;
		this.Address=addr;
		this.salary=sal;
	}
	public void Displayinfo(){
	System.out.println(name);
	System.out.println(Address);
	System.out.println(salary);
}



}

class Main{
	public static void main(String args[]){
	Emp e1=new Emp("Bob","Virar",12000);
	Emp e2=new Emp("tom","vasai",1000);
	//Emp e3=new Emp1();
	//e1.name="Bob";
	//e1.Address="Virar";
	//e1.salary=12000;
	e1.Displayinfo();
	e2.Displayinfo();
	
	
	
	}
}
