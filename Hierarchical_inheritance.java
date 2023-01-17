package Inheritance;

class pulsar {
	{
		System.out.println("class pulsar");
	}
}
class pulsar125 extends pulsar{
	
	public void bikemodel() {
		System.out.println("the bike model is : pulsar125");
	}
	public void engine() {
		System.out.println("Engine : 124cc");
	}
	public void mileage() {
		System.out.println("mileage: 51.46kmpl");
	}
}
class pulsarRS200 extends pulsar{
	
	public void bikemodel() {
		System.out.println("the bike model is : pulsarRS200");
	}
	public void engine() {
		System.out.println("Engine : 199cc");
	}
	public void mileage() {
		System.out.println("mileage: 62.46kmpl");
	}
}
class pulsarNS160 extends pulsar{
	
	public void bikemodel() {
		System.out.println("the bike model is : pulsarNS160");
	}
	public void engine() {
		System.out.println("Engine : 160cc");
	}
	public void mileage() {
		System.out.println("mileage: 40.6kmpl");
	}
}
public class Hierarchical_inheritance {

	public static void main(String[] args) {
	
		pulsar125 obj1 = new pulsar125();
		pulsarRS200 obj2 = new pulsarRS200();
		pulsarNS160 obj3 = new pulsarNS160();
		
		obj1.bikemodel();
		obj1.engine();
		obj1.mileage();
		
		obj2.bikemodel();
		obj2.engine();
		obj2.mileage();
		
		obj3.bikemodel();
		obj3.engine();
		obj3.mileage();

	}

}
