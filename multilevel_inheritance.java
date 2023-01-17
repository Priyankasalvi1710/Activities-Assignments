package Inheritance;

class car{
	{
	System.out.println("class car");
	}
	
}
class audiQ7 extends car{
	public void price() {
		System.out.println("The price is : 83.32 lakh");
	}
	public void brand() {
		System.out.println("The brand is : AudiQ7");
	}
	public void mileage () {
		System.out.println("The mileage is : 11.2kmpl");
	}
}
class audiQ3 extends car{
	public void price() {
		System.out.println("The price is : 44.89 lakh");
	}
	public void brand() {
		System.out.println("The brand is : AudiQ3");
	}
	public void mileage () {
		System.out.println("The mileage is : 14.2kmpl");
	}
}
public class multilevel_inheritance {

	public static void main(String[] args) {
audiQ7 obj1 = new audiQ7();		
audiQ3 obj2 = new audiQ3();

obj1.brand();
obj1.mileage();
obj1.price();
obj2.brand();
obj2.mileage();
obj2.price();	

	}

}
