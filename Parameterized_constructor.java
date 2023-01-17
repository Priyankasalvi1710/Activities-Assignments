package learning;

public class Parameterized_constructor {

	Parameterized_constructor(int num1, int num2, int num3){
		int sum;
		sum = num1 + num2;
		int sub ;
		sub = num1-num2-num3;
		System.out.println("sum is : " + sum );
		System.out.println("Substraction is : " + sub );
		 
	}
	
	
	public static void main(String[] args) {
		
		Parameterized_constructor obj1 = new Parameterized_constructor(20,10,15);
	}

}
