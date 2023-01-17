package Expections;

class Try_catch {

	public static void main(String[] args) {
		
		int num1, num2;
		try {
			num1 = 0;
			num2 = 23/num1;
			System.out.println(num2);
			
		}
		
		catch (ArithmeticException e) 
		{
			System.out.println("you should not divide a number by zero");
		}

	}

}
