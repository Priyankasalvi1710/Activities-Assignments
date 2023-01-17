package learning;

public class Method_static_public {
	
	// static method
	
	static void add(int a, int b, int c, int d) {
		int sum = a+b+c+d;
		System.out.println("Addition of four number is : " + sum);
	}
		static void sub(int a, int b, int c, int d) {
			int subt = a-b-c-d;
			System.out.println("Substraction of four number is: "+ subt);
	}
	
// public method
		
		public void div() {
			int a = 15;
			int b = 5;
			int c = 6;
			 float divd = (a+b)/c;
			
			System.out.println("Division" + divd); 
		}
		
		public void mul() {
			int a = 15;
			int b = 5;
			int mult = a*b;
			System.out.println("Division" + mult); 
		}
		
	public static void main(String[] args) {
		add(5,6,6,8);
		sub(100,10,20,30);

		Method_static_public obj1 = new Method_static_public();
		obj1.div();
		
		Method_static_public obj2 = new Method_static_public();
		obj2.mul();
	}

}
