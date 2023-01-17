package Expections;

public class Null_pointer_expections {

	public static void main(String[] args) {
		String str = null;
		String a = "priyanka";
//		System.out.println(str.toUpperCase());
		
		try
		{
//			System.out.println(str.toUpperCase());
			
//			System.out.println(str.toLowerCase());
			
//			converting string into integer
			int p = Integer.parseInt(a);
			System.out.println(p);
			System.out.println("String numberFormatExpection");
		}
		
		catch(NullPointerException n) {
			
			System.out.println("null can't be casted to upper and lower cases");
				
		}
		catch(NumberFormatException e) {
			System.out.println("String "+a+" can't be converted to integer");
		}
		
		finally
		{
			System.out.println("finally block is always executed");
		}

	}

}
