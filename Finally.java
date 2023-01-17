package Expections;

public class Finally {

	public static void main(String[] args) {
		
		try {
			int data = 65/0;
			System.out.println("Result: " + data);
		}
		catch(ArithmeticException e)
		{
			System.out.println("can't divide by zero");
		}
		
		finally
		{
			System.out.println("finally block is always executed");
		}
	}

}
