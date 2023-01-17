package learning;

public class Default_constructor {

	int a;
	int b;
	double c;
	String d;
	Default_constructor(){
		System.out.println("Default constructor");
		int sum;
		sum = a+b;
		System.out.println("Addition is: " + sum);
		
		double div;
		div = (a+b)/c;
		System.out.println("Division is : " + div);
		
	}
	public static void main(String[] args) {
		
		Default_constructor obj = new Default_constructor();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
		

	}

}
